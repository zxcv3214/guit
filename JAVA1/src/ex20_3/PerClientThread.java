package ex20_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerClientThread extends Thread{
	//ArrayList객체를 여러 스레드가 동시에 사용하게 되면 문제가 발생할 수 있어 안전하게 공유할 수 있는 동기화된 리스트
	//동기화된 리스트로 만들기 위해 java.util.Collections 클래스의 synchronuzedList메소드 이용
	  static List<PrintWriter> list 
	  			= Collections.synchronizedList(new ArrayList<PrintWriter>());
	private Socket socket;
	private PrintWriter writer;
	
	PerClientThread(Socket socket) {
		this.socket=socket;
		try {
			writer= new PrintWriter(socket.getOutputStream());
			list.add(writer); //리스트에 소켓의 출력 스트림을 등록합니다/
			} catch (Exception e) {
				e.printStackTrace();
		}
	}
	public void run() {
        String name = null;
        BufferedReader reader = null;
        try {
               reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));            
            //수신된 첫번째 문자열을 대화명으로 사용하기 위해 저장합니다.
            name = reader.readLine();           
            sendAll("#" + name + "님이 들어오셨습니다");
            
             while (!socket.isClosed()) {
                String str = reader.readLine();
                //소켓의 연결이 끊어지면 null을 리턴합니다.
                if (str == null)
                    break;
                //수신된 메시지 앞에 대화명을 붙여서 모든 클라이언트로 송신합니다.
                sendAll(name + ">" + str);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
        	list.remove(writer);
        	 //사용자가 채팅을 종료했다는 메시지를 모든 클라이언트로 보냅니다.
            sendAll("#" + name +"님이 님이 나가셨습니다");
            try {
                reader.close();
            }catch (Exception ignored) {
            	System.out.println("소켓 닫는 중에 에러 발생했습니다.");
            }
        }
    }
	//서버에 연결된 모든 클라이언트를 똑같이 메시지를 보냄
	synchronized private void sendAll(String str) {
		for(PrintWriter writer : list) {
			writer.println(str);
			writer.flush();
		}
		System.out.println(str);
	}
}

//객체를 직렬화하는 프로그램
/*
 	직렬화 : 객체를 네트워크를 통해 전송하거나 파일에 저장하기 위해서 객체를 스트림으로 만드는 작업이 필요합니다.
 			이런 작업을 자바에서는 객체의 직렬화(serialization)라고 합니다.
 			즉, 직렬화는 객체를 바이트 형태로 변환하는 과정입니다.
 * */
package ex19_01_Serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class objectInputExample1 {

	public static void main(String[] args) {
		/*
		 * 1. 파일을 엽니다.
		 * ObjectInputStream 클래스는 객체를 스트림으로 만들어서 출력하는 기능이 있는 클래스입니다.
		 * 이 클래스에는 데이터를 파일에 저장하는 기능이 없기 때문에 FileInputStream 클래스와 함께 사용해야 합니다.
		 * FileInputStream 객체를 생성해서 ObjectInputStream클래스의 생성자 파라미터로 넘겨주어야합니다.
		 * */
		ObjectInputStream in =null;
		try {
			in = new ObjectInputStream(new FileInputStream("output.dat"));
			while (true) {
			/*
			 * 2. 파일에 쓰기 - 객체를 역직렬화 하는 부분입니다.
			 * readObject 메소드 : 입력된 스트림으로부터 객체를 만들어서 리턴하는 메소드로 리턴타입은 Object입니다.
			 * 리턴 타입 Object를 원래의 클래스 타빙으로 사용하기 위해 캐스트 연산을 해야한다.
			 * 리턴 타입 readObject()가 object형이므로 GregorianCalendar 타입으로 형 변환을 해야합니다.
			 * */
					GregorianCalendar calendar = (GregorianCalendar) in.readObject();
					int year= calendar.get(Calendar.YEAR);
					int month = calendar.get(Calendar.MONTH)+1;
					int date = calendar.get(Calendar.DATE);
					System.out.println(year + "/" + month + "/" + date);
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일로 존재 하지 않습니다.");
		}catch (EOFException eofe) {//파일로부터 더 이상 읽을 객체가 없을 때 발도하는 원리
			System.out.println("끝");
		}catch (IOException ioe) {
			System.out.println("파일로 읽을 수 습니다.");
		}catch (ClassNotFoundException ioe) {
			System.out.println("해당 클래스가 존재할 수 없습니다.");
		}
		finally {
			try {
				if(in != null)
					in.close();// 3.파일을 닫기
			} catch (IOException e) {
				System.out.println("파일 닫는 중 오류 발생");
			}
		}
	}

}

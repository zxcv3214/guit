//File 클래스를 디렉토리 생성
//실행 한번 후 : 새로 만든 디렉토리 이름
//실행 두번 후 : 이미 있는 디렉토리 이름
package ex18_7_File;
import java.io.File;
import java.io.IOException;
public class FileExample2_2 {

	public static void main(String[] args) {
		
		String dir = "E:\\newDirectory";
		
		File f2 = new File(dir);
		if(!f2.exists()) {//E:\\newDirectory 디렉토리가 없는 경우
			if(f2.mkdir()) {// 디렉토리 생성 - 생성되면 true, 실패하면 false
				System.out.println("새로 만든 디렉토리 이름 : " +f2.getPath());
			}else {
				System.out.println("디렉토리 생성에 실패했습니다.");
			}
		}else {//E://newDirectory 디렉토리가 있는 경우
			System.out.println("이미 있는 디렉토리 이름 : " + f2.getPath());
		}
		
		//파일 객체 생성
		File f = new File(dir+"\\newFile.txt");
		
		if(f.exists()) {
			System.out.println(f.getPath());
		}else {
			try {
				//IOException 발생
				//boolean java.io.File.createNewFile() throws IOException
				if(f.createNewFile()) {
					System.out.println(f.getPath() + "에 새로운 파일을 만들었습니다.");
				}
			} catch (IOException e) {
				System.out.println("IOException 발생했습니다.");
			}
		}
	}
}
package ex07_20_Exception;

public class ExceptionExample1_2 {
//checked exception에 해당 - 컴파일 에러 발생
//해결책 : try~catch 문으로 처리 또는 메서드 밖으로 던짐
	public static void main(String[] args) {
		int sum = 1 + -2;
		try {
			if (sum < 0) {	
				throw new Exception("에러 발생");
			}
		} catch (Exception e) {
			System.out.println("[catch]"+e.getMessage());
		}
	}
	
}

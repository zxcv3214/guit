//문자열 추출 메소드
/*
 * 1. substring(int beginIndex) : beginIndex부터 문자열 끝까지 부분 문자열 리턴
 * 2. substring(int beginIndex, int endIndex) : beginIndex부터 endIndex-1 까지 부분 문자열 리턴
 * 
 * *
 */
package ex11_1_String_test2;

public class StringTest02_1 {

	public static void main(String[] args) {
		String jumin = "123456-4123456";
		
	switch (jumin.substring(7, 8)) {
		case "1","3":
			System.out.println("추출한 숫자는" + jumin.substring(7, 8)+ "이고 남자입니다.");
				break;
		
		case "2","4": 
			System.out.println("추출한 숫자는" + jumin.substring(7, 8)+ "이고 여자입니다.");
				break;

			default:
				System.out.println("추출한 숫자는" + jumin.substring(7, 8) + "그 외 외국인입니다.");
			
	
		}
	}
}

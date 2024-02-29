/* 열거 상수를 다른 값과 연관 짓는 예
 * 열거 타입은 프로그램 내부에서 클래스로 취급되기 때문에
 * 생성자, 필드, 메소드를 포함할 수 있다.
 */
package ex09_12_enum;
enum Season {
	//문장 끝에 세미콜론을 추가한다.
	SPRING("봄"), SUMMER("여름"), FALL("가을"), WINTER("겨울");
	
	//private final를 사용해서 외부에서 name에 접근하지 못하고 한 번 설정된 값을 변경하지 못하도록 한다.
	private final String name;
	
	private Season(String name) { //생성자 접근 제어자 private 사용,
								  //열거 상수 선언에 의해 자동으로 호출
								  //열거 상수 다음의 괄호 안에 있는 값이
								  //생성자 파라미터로 넘어오게 된다.
		this.name = name;
		System.out.println("생성자   " + name + " 호출");
	}
	
	//private 필드에 저장되기 대문에 외부에서 필드의 값을 읽기 위한 메소드 필요
	//열거 상수에 연관된 값을 리턴하는 메소드
	String value() {		//메소드 명은 임의로 정하는 것
		return name;
	}

}


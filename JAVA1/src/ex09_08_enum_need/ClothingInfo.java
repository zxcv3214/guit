//사계절을 표현하는 코드 값을 상수로 선언해서 사용하는 예
//의류 정보 클래스
package ex09_08_enum_need;
class ClothingInfo {
	String code;
	String name;
	String marterial;
	int season;
	
	//사계절을 표현하는 상수 필드
	static final int SPRING =1;
	static final int SUMMER =2;
	static final int FALL   =3;
	static final int WINTER =4;
	
	public ClothingInfo(String code, String name,
						String marterial,int season) {
		this.code = code;
		this.name = name;
		this.marterial = marterial;
		this.season = season;	
					//주석 풀면?
		
	}
}

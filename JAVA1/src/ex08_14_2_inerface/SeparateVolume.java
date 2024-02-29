package ex08_14_2_inerface;

public class SeparateVolume implements Lendble{

	String requestNo;   //청구번호
	String bookTitle;   //제목
	String writer;      //저자
	String borrower;    //대출인
	String checkOutDate;//대출일
	byte state;         //대출상태
	
	SeparateVolume(String requestNo, String bookTitle, String writer){
		this.requestNo=requestNo;
		this.bookTitle=bookTitle;
		this.writer=writer;
	}
	
	@Override
	public void checkOut(String borrower, String date) {
		//기능1 만일 대출상대가 0이 아니면 메서드 종료
		//기능2 두 개의 매개변수를 이용해 필드 초기화
		//기능3 대출상태로 1로 변경
		//기능4 
		if(state != 0) {
			return;
		}else {
			this.borrower=borrower;
			this.checkOutDate=date;
			this.state=1; //대출상대 : state=1;
			System.out.println("*"+ bookTitle + "이(가) 대출되었습니다");
			System.out.println("대출인:" +borrower);
			System.out.println("대출일:" + date + "\n");
		}
	}
	@Override
	public void checkIn() {
		//기능1 대출인, 대출일을 null로 변경
		//기능2 대출상대를 0으로 변경
		//기능3  
		if(state != 1) {
			this.borrower= null;
			this.checkOutDate = null;
			this.state =0 ;
		}else {
			System.out.println("*"+ bookTitle + "이(가) 반납되었습니다.");
		}
	}
}

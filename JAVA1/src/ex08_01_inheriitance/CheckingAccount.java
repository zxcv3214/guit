package ex08_01_inheriitance;
//은행 계좌 클래스를 상속받는 직불 계좌 클래스
//은행 계좌 클래스(Account)			--슈퍼 클래스(상속을 해주는 클래스)
//직불 계좌 클래스(CheckingAccount)	--서브 클래스(상속을 받는 클래스)
public class CheckingAccount extends Account{

		String cardNo;//직불카드 번호
		/* 생성자가 없어도 값이 나올수있다.*/
		CheckingAccount() {
			super(); //super() 부모 생성자 호출
		}
		
		
	/*	메소드 이름 : pay
		매개변수 : 카드 번호(cardNo-문자열),인출액(amount-정수형)
		반환형 : int	
		*/
	//직불 카드 사용액을 지불한다에 해당하는 메소드
	int pay(String cardNo, int amount) throws Exception {
		if(!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("지불이 불가능합니다.");
		return withdraw(amount);
	}
	
	
	
	
	
	
	
}

//생성자가 추가된 직불 계좌 클래스
package ex08_02_constructor;
public class CheckingAccount extends Account {
	String cardNo;
	
	//생성자의 첫 줄에서 조상 클래스의 생성자를 호출하는데 자손 클래스의 멤버가
	//부모 클래스의 멤버를 사용할 수도 있으므로, 부모의 멤버들이 먼저 초기화되어 있어야 한다.
	CheckingAccount(String accountNo, String ownerName,
					int balance, 	  String cardNo) {
		//생성자 첫 줄에서 부모 생성자를 호출하지 않았기 때문에
		//컴파일러가 자동으로 부모의 생성자를 호출하는 문장인 super();를 여기에 삽입한다.
		//super();
		this.accountNo = accountNo; //상속 받은 필드 초기화
		this.ownerName = ownerName; //상속 받은 필드 초기화
		this.balance = balance;		//상속 받은 필드 초기화
		this.cardNo = cardNo;		//클래스 안에 선언된 필드 초기화
	}

	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("지불이 불가능합니다.");

		return withdraw(amount);
	}

}

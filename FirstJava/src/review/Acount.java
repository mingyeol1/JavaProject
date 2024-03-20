package review;

public class Acount {

	public static void main(String[] args) {
		Account1 a1 = new Account1();
		a1.saveMoney(100000);
		System.out.println("현재 금액 : "+a1.getBalance()+"원");
		a1.saveMoney(600000);
		System.out.println("현재 금액 : "+a1.getBalance()+"원");
		a1.withdrawMoney(700000);
		System.out.println("현재 금액 : "+a1.getBalance()+"원");

	}

}


/*
클래스 명 : Account
속성(명사적 특성) : 이름, 계좌번호, 패스워드, 예금, 이자
기능(동사적 특성) : 입금, 출금, 예금 확인
생성자 : 이름, 계좌번호, 패스워드, 예금 를 이용한 오버로딩
*/

class Account1{
	public String name;
	public String accountNumber;
	public String accountPw;
	public long balance;
	public float interest;
	
	
	
	public void saveMoney(long amount) {
		balance += amount;
	}


	public void withdrawMoney(long amount) {
		balance -= amount;
	}
	
	
	public long getBalance() {
		
		return balance;
	}

}




public class H05_threadEx4 {

	public static void main(String[] args) {
		//통장 객체 생성
		Account1 acc = new Account1();
		
		//엄마 스레드 객체 생성
		Mother mother = new Mother(acc);
		//아들 스레드 객체 생성
		Son son = new Son(acc);
		
		mother.start();
		son.start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {}
		//스레드 중지
		son.interrupt();
		mother.interrupt();
	}

}
//통장 클래스
class Account1{
	int money;
	synchronized void withdraw() {
		while(money == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				break;	//예외가 발생하면 멈추기.
			}
		}
		notifyAll();
		System.out.println(Thread.currentThread().getName()+money+"원 출금");
		money = 0;
	}
	
	synchronized void deposit() {
		while(money > 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				break;
			}
			
		}
		//랜덤 입금 1 ~ 5 만원
		money = (int)((Math.random()*5)+1)*10000;
		notifyAll();
		System.out.println();
		System.out.println(Thread.currentThread().getName()+money+"원 입금");
	}
}

//엄마 스레드
class Mother extends Thread {
	Account1 account1;
	
	public Mother(Account1 account1) {
		super("엄마");
		this.account1 = account1;
	}
	@Override
	public void run() {
		while(true) {
			try {
				account1.deposit();
				sleep((int)(Math.random()*2000));
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}

//아들 스레드
class Son extends Thread {
	Account1 account1;
	
	Son(Account1 account1){
		super("아들");
		this.account1 = account1;
	}
	@Override
	public void run() {
		while(true) {
			try {
				account1.withdraw();
				sleep((int)(Math.random()*300));
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}
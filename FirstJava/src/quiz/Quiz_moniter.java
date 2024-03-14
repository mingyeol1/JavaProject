package quiz;

public class Quiz_moniter {

	public static void main(String[] args) {
	

	}

}

class Moniter{
	static final int MAX = 100;
	
	
	
	// 멤버 변수 - 속성
	public int resloutionl;
	public int size;
	public int brightness;
	boolean status;
	//생성자 constructors
	public Moniter() {
		this.resloutionl = MAX;
		this.size = MAX;
		this.brightness = MAX;
		this.status = false;
	}
	
	
	//전원 메서드
	public void pressPowerButton() {
		status = !status;
	}





}
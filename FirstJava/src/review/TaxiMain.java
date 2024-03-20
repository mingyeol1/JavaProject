package review;

class Car{
	String color = "white";
	int num = 5; 
	
	public void go() {
		System.out.println("전진");
	}
	 void back() {
		System.out.println("후진");
	}
}
class Taxi extends Car{ //재정의  완전히 똑같아야함
	int num = 3;
	public void go() {
		System.out.println("저저저저저저ㅓㅈ전진");
	}
}

public class TaxiMain {

	public static void main(String[] args) {
		double d = 3L;
		System.out.println(d);
	}

}

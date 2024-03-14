import obj.Pen;

public class C01_Class2 {

	public static void main(String[] args) {
		// 인스턴스 객체 생성
		
		//객체 생성 명령어
		// ClassName instanceName = new Construcor();   //생성자는 클래스 이름과 같다.
		//생성자의 역할은 멤버변수(속성) 초기화 혹은 클래스 구동을 위한 사전동작을 구현.
		//자바7버전 이후로는 생성자가 자동으로 생김.
		
		Pen redPen = new Pen();
		redPen.color = "red";
		System.out.println(redPen);
		System.out.println(redPen.color);
		//쓰기
		redPen.write();
		
		
		
		//클래스를 사용하는 이유?
		// 대량으로 코드를 반복저으로 사용하는 경우에 사전에 틀을 만들어 사용하기 위해서 클래스를 사용함.
		// 코드를 최소하여 작업을 할 수 있음.
		
		
		//기본 생성자를 통한 instance 객체 생성
		Pen pen1 = new Pen();
		System.out.println(pen1);
		System.out.println(pen1.color);
		
		//멤버 초기화 생성자를 통한 instance 객체 생성
		Pen pen2 = new Pen("blue");
		System.out.println(pen2);
		System.out.println("펜의 색상은"+pen2.color+"입니다.");
		
		Pen pen3 = new Pen("yellow");
		System.out.println(pen2);
		System.out.println("펜의 색상은"+pen3.color+"입니다.");
		
		//멤버 초기화 생성자를 통한 인스턴스 객체  색상, 가격
		Pen pen4 = new Pen("hot pink", 1000); 					//둘이 반대로 하고싶으면 생성자위치를 바꿔야한다.     
		System.out.println(pen4);
		System.out.println("펜의 색상은 '"+pen4.color+"'입니다.");
		System.out.println("펜의 가격은 '"+pen4.getPrice()+"'입니다.");
	
		Pen pen5 = new Pen("red", 5, 500);
		System.out.println(pen5);
		System.out.println("펜의 색상은 : "+pen5.color);
		System.out.println("펜의 가격은 : "+pen5.length);
		System.out.println("펜의 길이는 : "+pen5.getPrice());
		
	
	
	
	
	}

}

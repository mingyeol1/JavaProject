
/*
 * Usage Modifier - abstract
 * 
 * 	의미
 * abstract 제한자는 아직 구현되지 않았다는 의미를 가짐.
 * abstract 제한자는 클래스, 메서드에 사용합니다. 변수에는 사용하지 않는다.(변수에는 사용 불가.)
 * 
 * 	클래스에 사용하는 경우,
 * 	>객체를 생성 할 수 없다.
 *  > 다형성을 동태서 추상클래스의 자료형으로 가지는 객체를 생성할 수 있다.(추상 클래스를 상속받은 자식들은 객체를 생성할 수 있다.)
 *  > 추상 클래스가 된다.
 *  >'반드시' 상속을 받아서 사용해야 한다.
 *  
 *  메서드에 사용하는 경우
 *  >추상 메서드가 된다.
 *  >메서드의 구현부분이 없다.
 *  
 *  **추상메서드를 하나라도 포함하는 클래스는 추상 클래스가 되어야한다.
 *  **그러나, 추상 클래스가 꼭 추상메서드를 가져야 할 필요는 없다.
 * 
 * 
 * 
*/

// 도형
abstract class Shape{ //추상 클래스
	
	private int x;
	private int y;
	
	public Shape() {} //기본생성자
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public abstract double getArea();
	
	public String posting() {
		return "[x="+x+" ,y="+y+"]";
	}
	
	
	
	
	

}
//----------------------------- 원형
class Circle extends Shape{

	private int radius;
	
	public Circle(int r) {
		this(0, 0, r);
	}
	
	public Circle(int x, int y, int r) {
		super(x, y);
		this.radius = r;
	}
	
	//shape를 부모로 하는 사각형(rectangle) 삼각형(triangle) 클래스를 만들어보자.
	
	@Override
	public double getArea() {
		return (Math.PI * radius * radius);
	}
	
}
//---------------------------------

class Rectangle extends Shape{
	
	int width;
	int height;
	
	
	public Rectangle(int width, int height) {				//생성자
		this(0, 0, width, height); 
	}
	
	public Rectangle(int x, int y, int width, int height) {		//생성자
		super(x, y);
		this.height = height;
		this.width = width;
	}
	
	@Override
	public double getArea() {
		
		return width * height;
	}
	
}

class Triangle extends Shape{
	
	int width;
	int height;
	
	
	
	
	





	public Triangle(int width, int height) {
		this(0,0, width, height);
	}


	public Triangle(int x, int y,int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}


	@Override
	public double getArea() {
		
		return (width * height)/2;
	}
}




public class C10_abstract {
	public static void main(String[] args) {
		Shape Circle = new Circle(10);
		
		
		System.out.println("원의 넓이는 : "+Circle.getArea());
		System.out.println("도형의 넓이는"+Circle.getArea());
		
		Shape rectangle = new Rectangle(20, 5);
		System.out.println("사각형의 넓이는 : "+rectangle.getArea());
		
		Shape triangle = new Triangle(20, 5);
		System.out.println("삼각형의 넓이는 : "+triangle.getArea());
	}

}

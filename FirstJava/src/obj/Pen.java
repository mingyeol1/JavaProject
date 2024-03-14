package obj;

public class Pen {
	//클래스 안에 코드는 크게 3가지가 있다.
	// attribute(속성, 멤버변수 ,필드라고도 부름), constructors(생성자), method(메서드)
	//   (변수)                                  (멤버변수 초기화)          (행위)


	//멤버변수 = attribute
	public String color;     //패키지 관계 없이 불러올 수 있음.
	public int length;
	int price;				 //같은 패키지 내에서만 불러올 수 있음. - default

	
	//메서드
	public void write() {
		System.out.println("Hello World!!!!!");
	}

//	public Pen() { //기본 생성자 //아무것도 안하면 생략되어있음.
//		super();
//	}
	
	/*
	  // 생성자.
	   * 생성자는 반드시 클래스 안에 하나 이상 선언해야 함.
	   * 선언하지 않으면, JVM(JAVA Virtual Machine)이 대신해서 기본 생성자를 자동으로 만들어 줌.
	   * 기본 생성자는 매개변수를 가지고 있지 않은 형태로, 자동으로 만들어지는 경우에는 내용이 없다.
	   * 
	   * ##생성자 만드는 규칙
	   * 1. 생성자 이름은 클래스 이름과 대소문자까지 정확히 같아야 한다.
	   *  클래스 이름과 다른 이름으로 만들게 되면 그것은 메서드 취급!
	   * 2. 생성자는 메서드와 달리 반환 유형을 적지 않는다.
	   * 3. 생성자는 다른 유형으로 여러개 생성이 가능한다.(생성자 오버로딩)
	*/
	
	
	//생성자 생성 예시.
	
	public Pen() { //()안에 아무것도 없으면 기본 생성자.
		color = "black"; //기본생성자에 색상에 대한 초기화.
	}

	// 멤버 초기화 생성자 
	public Pen(String init_color) {    //매개변수 존재 오버로드
		color = init_color;
		System.out.println("생성자를 이용하여 color값 초기화");
	}
	
	public Pen(String init_color, int init_price) {
		color = init_color;
		price = init_price;
		System.out.println("생성자를 이용하여 color, price 값 초기화");
	}
	
	public Pen(String color, int length, int price) {
		this.color = color;
		this.length = length;
		this.price = price;
	}
	
	// 오버로딩으로 구분되는 생성자 혹은 메서드는 매개변수의 숫자와 타입(타입 순서)에 의해서 결정!
	// 조건
	// 1.오버로딩을 하기 위해서는 이름이 같아야 한다.
	// 2.접근제한자나 반환유형은 오버로딩에 영향을 주지 않는다.
	// 3.매개변수의 유형이 달라야 한다.(데이터 타입(int , float등)이 달라야함)
	// 4.매개변수의 개수가 달라야 한다.
	// 5. 매개변수의 순서가 달라야한다
	
	
	public Pen(int length, String color) {
		this.color = color;
		this.length = length;
	
	}
	
	
	
	
	
	public int getPrice() {
		return price;
	}

}

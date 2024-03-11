
public class B08_variableLifeTime {
	
	
	static int c; //클래스 멤버변수 딱 하나만 만들어지는 변수  //클래스에 직접 사용하는 변수 객체 생성과 상관x
	int b = 8; //인스턴스 멤버변수(필드, 속성) //전역변수. 	//객체가 생성되어야 쓸 수 있음.

	public static void main(String[] args) {
		// 변수의 수명
		
		//{} 블럭 내부에서 선언된 변수는 '지역변수'로 {}을 벗어나면 사라짐
		//변수가 살아 있는 범위를 변수의 영역(Scope)라고 부른다.
		//변수의 영역만 겹치지 않는다면 같은 이름의 변수를 사용할 수 있다.
		
		
		int b = 5; //로컬변수 //지역변수
		System.out.println("main method의 b : "+ b);
		c = 10;
		System.out.println("Calss 멤버변수 c : "+ c);
	
		// 객체 생성
		B08_variableLifeTime obj = new B08_variableLifeTime(); //객체생성
		System.out.println("class의 b(인스턴스 멤버 변수) : "+obj.b);
		System.out.println();
		B08_variableLifeTime obj2 = new B08_variableLifeTime();
		obj2.b = 100; //ob2 객체의 b인스턴스 변수의 값을 수정
		System.out.println("class의 b(obj 인스턴스 멤버 변수) : "+obj.b);
		System.out.println("class의 b(obj2 인스턴스 멤버 변수) : "+obj2.b); //만들어진 이후에는 서로 영향x
		
		
		//클래스 변수.. //공통변수 c의 값을 바꾸면 모든 c의 값이 바뀜.
		System.out.println("================================");
		System.out.println("obj.c에 값을 대입하기 전 : "+obj.c);
		obj.c = 20;
		System.out.println("obj.c에 값을 대입하기 후 : "+obj.c);
		System.out.println("대입한 후 obj2.c : "+obj2.c);
		
		System.out.println("============================");
		B08_variableLifeTime.c = 200;
		System.out.println("대입한 후 obj.c: "+obj.c);
		System.out.println("대입한 후 obj2.c : "+obj2.c);
		
		
		
		if(true) {
			int a = 10;   //지역변수
			System.out.println(a);
			a= 7;
			System.out.println("main 메서드의 b : "+ b);
//			int b = 10; 메인이란 영역에 선언되어 안됨.
		
		}// 블럭을 벗어나면 불러올 수 없음.
//		a = 7;  
		if(true) {
			int a= 20;
			System.out.println(a);
		}
		//int i = 0; 으로 for문 밖에서 선언되면 메인의 변수. //for문 안에서 선언이 되면 for문의 변수(지역변수)
		for(int i = 0; i < 10; i++) {
			// for문에서 사용되는 int i(초기값) : {}내에서 선언된 지역변수.
			//int i의 값은 for문을 벗어 날 수 없다.
		
		}
		
	
		
		
		
	}

}

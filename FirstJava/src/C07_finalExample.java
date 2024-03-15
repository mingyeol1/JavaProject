/*
 * Usage Modifier final
 *	의미
 *	일반적으로 final은 그 값이 변하지 않음을 의미함.
 *	변수에 final이 붙으면 그 값은 변경할 수 없다. 때문에 static하고 같이 사용시 상수로 사용
 * 메서드에 final이 붙으면 그 메서드는 재정의할 수 없다. 재정의 될 필요가 없는 메서드일 때 사용한다.
 * (개발자가 재정의를 허용하지 않기 위해서 사용한다./재정의 하지 못하게 하기 위해.
 * 클래스에 final이 붙으면 그 클래스는 자식 클래스를 가질 수 없다.
 * 
*/

class MyDate{
	int year = 2024;
	int month = 3;
	int day = 15;
	
	public String toString() {
		return "["+year+"-"+day+"]";
	}
	public void doIt(final int a) { //a란 매개변수를 final이 붙어 a++로 재정의 할 수 없다. a란 값은 고정.
//		a++;     	//The final local variable a cannot be assigned.//재정의 할 수 없다. 
	}
}

final class Parent{										//상속 부모		클래서에 final을 붙이면 상속이 안된다.
	public final void method() {
		System.out.println("Parent = method()");
	}
}

//class Child extends Parent{							//상속 자식 //부모의 final이 붙으면 상속이 안됨...
//	//부모가 final로 정의한 메소드는 재정의(Override) 불가.
//	//	public void method() {}		Cannot override the final method from Parent
//}

class FinalInit{		//파이널 값을 초기화
	final int a;
	
//	1) final int a = 10; //선언과 동시에 초기화 한 것
	
//	2)인스턴스 초기화자를 사용한 것.
//	{
//		a = 10;
//	}
//	3) 생성자를 이용
//	FinalInit() {			//접근제한자를 붙일 수도 있음 public 등      //final은 값이 하나 나오면 그상대로 고착(고정)이 된다.
//		a = 10;
//	}
	FinalInit(int a){   //이것은 final 필드의 초기화가 아니다. //초기화자를 이용한 방식이 아니다. 
		this.a = a;
	}
	
	
}


public class C07_finalExample {

	static final MyDate dote = new MyDate(); //메모리 주소값이 안바뀜 / 객체값이 안바뀜
	
	public int data = 100;
	
	public static void main(String[] args) {
		
	//	dote = new MyDate(); //date변수로 새로운 객체 생성이 안된다.
	
		System.out.println(dote.toString());
		
		System.out.println(dote.toString());
		dote.year = 2025;
		System.out.println(dote.toString());
		
		//로컬 변수 사용
		new C07_finalExample().doIt("홍길동");
		System.out.println();
		
		System.out.println(new FinalInit(100).a);
		

	}
	
	public void doIt(final String name) {				//값에 매개변수에 대한 변화가 없음
		final int age = 38;		//내부 클래스에 전달되어야 할 지역변수는 final을 '꼭' 붙여 사용한다. //final은 전달할 값이 변경되지 않을때 쓴다.
		class InnerLocal{		//내부 클래스중 하나		
			public void innerDoIt() {
				System.out.println("외부 클래스의 멤버변수 data : "+data);
				System.out.println("외부 클래스의 파라미터 변수name : "+name);
				System.out.println("외부 클래스의 지역변수 age : "+age);
			}
		}
		new InnerLocal().innerDoIt();
	}
	

}

/*Usage Modifier final
 * 의미
 * 일반적으로 final은 그 값이 변하지 않음을 의미함.
 * 변수에 final이 붙으면 그 값은 변경할 수 없다. 때문에 static하고 같이 사용시 상수로 사용한다.
 * 메서드에 final이 붙으면 그 메서드는 재정의(오버라이징)할 수 없다. 재정의 될 필요가 없는 메서드일 때 사용된다.
 * (개발자가 재정의를 허용하지 않기 위해서 사용.)/재정의 하지 못하게 하기 위해.
	클래스에 final이 붙으면 그 클래스는 자식 클래스를 가질 수 없다.
	
*/



package review;
class MyDate{
	int year = 2024;
	int month = 3;
	int day = 15;
	
public String toString() {
	return "["+year+"="+day+"]";
	}
	public void doIt(final int a) { //a란 매개변수를 final이 붙어 a++로 재정의 할 수 없다. a란 값은 고정.
	//	a++;		//he final local variable a cannot be assigned
		
	}
}
final class Parent{							//상속 부모 클래스에 final을 붙이면 상속이 불가함.
	public final void method() {
		System.out.println("Parent = method()");
	}
}

//class Child extends Parent{				//상속 자식 //부모의 final이 붙으면 상속이 안된다..
	//부모가 final로 정의한 메소드는 재정의(오버라이드)불가.
	//public void method() {}
//}
class FinalInit{  //파이널 값을 초기화
	final int a;
	//1)	final int a = 10; //선언과 동시에 초기화
//2)인스턴스 초기화자를 사용한것.
	
//	{
//		a = 0;
//	}
//3) 생성자를 이용
//	FinalInit() {	 //생성자는 클래스 이름과 같아야한다. //접근제한자인 pubilc 을 붙일 수도 있음 //final은 값이 하나 나오면 그생태로 고착 된다.
//				a = 10;
//	}
FinalInit(int a){  //이것은 final 필드의 초기화가 아니다. //초기화자를 이용한 방식이 아니다. 실행은 됨.
	this.a = a;
}
}


public class C07_finalExample {
	static final MyDate date = new MyDate(); //메모리 주소값이 안바뀐다. 객체값이 안바뀐다.
	
	public int data = 100;
	
	public static void main(String[] args) {
		
//		date = new MyDate;  /date변수로 새로운 객체 생성이 안된다.
		
		System.out.println(date.toString());
		System.out.println(date.toString());
		date.year = 2025;
		System.out.println(date.toString());		//메모리 즉 주소값이 안바뀌는거지 내용은 바꿀 수 있다.(상수는 아니다.)
		
		//로컬 변수 사용
		new C07_finalExample().doIt("홍길동");
		System.out.println();
		System.out.println(new FinalInit(100).a);
		}

	private void doIt(final String name) {
		final int age = 38;
		class InnerLocal{
			public void innerDoit() {
				System.out.println("외부클래스의 멤버 변수 data"+data);
				System.out.println("외부클래스의 파라미터 변수name"+name);
				System.out.println("외부클래스의 지역변수 age : "+age);
			}
		}
		new InnerLocal().innerDoit();
		
	}

}

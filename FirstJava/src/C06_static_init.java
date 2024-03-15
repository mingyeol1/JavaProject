class InstanceInit{
	public final int DATA; //초기화 되지 않았다.(초기값을 넣어줄 곳이 없다)
	//public final int DATA = 0;
	//Instance Initializer
	//생성자가 호출되기 전에 호출됨.
	//인스턴스 변수 초기화에 사용
	//생성자를 이용하여 인스턴스 변수 초기화가 가능하기때문에 사용할 기회는 많지 않음.
	{		// {} 인스턴스 초기화 자.
		DATA = 10;
		System.out.println("InstanceInit 실행.");
	}

}

/*
 *  Static
 *  - 변수, 메서드, static{}, 클래스에서 사용.
 *	- static 제한자는 지정된 변수와 메서드를 인스턴스와 무관하게 만들어 주기 때문에 this(클래스에서 만들어진 인스턴스 객체)를 가질 수 없다.
 *static 메서드는 non-static 메서드로 재정의 될 수 없음.
 * -변수
 * > 정적변수, 여러개의 인스턴스가 모두 동일한 장소를 참조.
 * final과 같이 사용되면 상수가 됨.
 * 객체 없이 참조 가능
 * 
 * -메서드
 * 객체 생성 없이 참조 가능(자주 사용하는 메서드들.)
 * >Math 클래서의 메서드가 대표적인 예
 * static 블럭에는 non-static 멤버를 직접 참조 못한다. -------static,obj Count 소스파일 참조하기
 * 객체를 생성해 사용가능
 * -클래스
 * >내부 클래스(클래스 안에 클래스)인 경우 사용가능
 * static{} - static initializer
 * 형식은 static {} 형태
 * 클래스가 로딩 될 때 딱 한번만 호출(동작), 생성자 호출되기 전에
 *
 */

// static 초기화자 클래스
class StaticInit{
	static { //생성자가 실행되기 전에 static 변수 초기화, 객체 여러번 생성해도 한번만.
		System.out.println("static initializer가 수정됨");
	}
	public StaticInit() {
		System.out.println("Constructor 호출됨");
	}
}

public class C06_static_init {

	public static void main(String[] args) {
		//테스트 확인
		StaticInit s1 = new StaticInit();
		System.out.println(s1);
		StaticInit s2 = new StaticInit();
		System.out.println(s2);
		
		System.out.println("main() 종료!");
	
		InstanceInit i1 =new InstanceInit();
		System.out.println(i1.DATA);
		InstanceInit i2 =new InstanceInit();
		System.out.println(i2.DATA);
		System.out.println("main() 두번째 종료!");
	
	
	}

}

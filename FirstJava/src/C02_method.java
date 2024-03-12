
public class C02_method {

	//메서드 (method)
	//클래스의 행동 및 기능을 나타낸다. 다른 언어에서는 함수라고도 부르지만.
	//JAVA에서는 클래스 내부에만 정의할 수 있기 때문에 메서드라는 용어를 사용한다.
	
	//메서드의 특징.
	// - 어떤 단어 뒤에 ()가 붙는 경우 메서드
	// 한번 만들어 두면 여러번 사용할 수 있음(코드의 재사용)
	// 여러 기능들을 묶어서 이름을 붙여 놓은 것이 메서드.
	// 값을 반환할 수 있다.
	
	
	
	
	// 메서드 형식
	// (접근 제한자) (static 여부) 반환타입 메서드명(매개변수 타임 매개변수 이름){
	//여러가지 기능을 구현.
	// }
	//
	//반환타입 : 메서드가 모든 기능을 수행한 후에 전달할 반환 값의 타입을 지정.
	//			반환할 때 사용하는 키워드는 return을 이용한다. ex) return 10(반환할 값);
	//	반환 타입 종류 : int, String, Student, char, float, double, boolean.....void
	// 	void 타입을 지정한 경우 함수의 반환값이 없음. 즉, return으로 전달할 값이 없다는 의미
	// 메서드명 : 메서드를 호출할 때 사용할 이름
	// 매개변수 : 함수를 호풀하면서()안에 전달해 주는 값을 의미함.
	// 매개변수 타입 : 매개변수의 타입을 지정.
	
	
	static int getInteger() {
		final int seed =5;;
		
		int result = 1;
		for(int i = 1; i < seed; i++) {
			result = seed * result;
		}
		//반환 값
		return result;   //result가 double이면 값을 바꾸던가 (int)result로 형 변환해야함
	}
	
	static void createRabbit() {
		System.out.println("===================");
		System.out.println("        /)/)       ");
		System.out.println("       (  ..)      ");
		System.out.println("       (   >♡      ");
		System.out.println(" Have a Good Time. ");
		System.out.println("===================");
	}
	
	static String makeBmmer(String msg) {
		return "* * * * " + msg +"* * * *";
	}
	
	
	
	
	public static void main(String[] atgs) {
		//메서드 정보확인  : 메서드를 가르키고 F2를 누르면 함수 정보 보기가 됨
		//메서드 정의된 곳으로 이동 : 메서드를 가르키고 F3을 누르면 정의된 곳으로 이동
		
		
		//호출하면 콘솔에 토끼출력하는 함수
		for (int i = 0; i < 10; i++)
			createRabbit();
		//문자열을 넣으면 * 를 붙여서 반환하는 메서드
	String result = makeBmmer("알 림");
	System.out.println(result);
	System.out.println(makeBmmer("오늘 할 일"));

	//정수형 값을 받는 메서드
	System.out.println(getInteger());
	}
	
	
	
	
	
	
	
}

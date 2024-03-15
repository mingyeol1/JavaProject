package obj;

public class Count {

	public int a = 0;
	public static int b = 0;
	
	public static int doIt() {
//		return ++a;
		
		//static 메서드는 인스턴스 변수(a)를 객체 생성 없이 참조 불가능
		++new Count().a;  //++(new Count().a)
		return ++b; //이 값을 static 소스파일 System.out.println("Count.doIt() : "+Count.doIt());에 리턴.
	
	
	
	}
}

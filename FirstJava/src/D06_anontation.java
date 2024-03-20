//import java.lang.reflect.Method;
//
//@interface UserAnnot {
//	String value();
//	int number() default 5;
//}
//
//class UserClass{
//	@UserAnnot (value = "A")
//	public void metodA() {
//		System.out.println("metodA() 실행");
//	}
//	@UserAnnot (value= "B", number = 10)
//	public void methodB() {
//		System.out.println("methodB() 실행");
//	}
//}
//
//public class D06_anontation {
//
//	public static void main(String[] args) {
//		Method method[] = UserClass.class.getDeclaredMethods();
//		System.out.println("metod[]에 있는 내용 갯수 : "+method.length);
//		for (int i = 0; i <method.length; i++) {
//			
//		}
//
//	}
//
//}

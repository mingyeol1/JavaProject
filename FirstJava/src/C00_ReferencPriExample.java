
public class C00_ReferencPriExample {

	public static void main(String[] args) {
		// //참조형 객체 비교
		
		//String 문자열 비교
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println((str1 == str2)); //일반객체는 수정해야함.
		
		//new를 사용한 객체 비교
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		System.out.println((str3 == str4));
		
		//문자열 비교는문자열 비교는 .equal()의 사용
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
	
	
	}

}

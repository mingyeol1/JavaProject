import obj.inheritance.Person;
import obj.inheritance.goodcase.Student;

public class C03_inheritanceExample {

	public static void main(String[] args) {
		
		
//		Person p = new Person();
//		p.name = "홍길동";
//		p.age = 25;
//		p.height = 179.8f; //protected - 같은 패키지 내와 상속된 클래스는 접근 가능
//		p.weight = 100.0f; default 가 되어 나오지 않음  같은 패키지 내에서만. 가능함. //public은 불러올 수 있다 
		
		
		Person p = new Person("홍길동", 25, 179.9f, 105.6f);
		System.out.println(p.getDatails());
		
//		Student s1 = new Student();
//		s1.name = "이순신";
//		s1.age = 30;
//		s1.studentId = "1234567";
//		s1.major = "해양";
		Student s1 = new Student("이순신", 30, "12345", "바다");
		System.out.println(s1.getDatails());
		
	}

}

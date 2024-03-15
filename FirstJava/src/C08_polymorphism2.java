import obj.inheritance.Person;
import obj.inheritance.goodcase.Employee;
import obj.inheritance.goodcase.Student;
import obj.inheritance.goodcase.Teacher;

public class C08_polymorphism2 {

	public static void main(String[] args) {
		Student s = new Student("중학생", 17, "20240315","Java");
		printPersonInfo(s);
		
		Teacher t = new Teacher("홍선생",22,"Java Programming");
		printPersonInfo(t);
		Employee  m = new Employee("홍사원", 25,"교무처");
		printPersonInfo(m);
	}
	
	
	//다형적 인자별(입력)로 출력하는 메서드
	public static void printPersonInfo(Person p) {
		if(p instanceof Student) {
			System.out.println("*********************Student Info*********************");
		}else if(p instanceof Teacher) {
			System.out.println("*********************Teacher Info*********************");
		}else if(p instanceof Employee) {
			System.out.println("*********************Employee Info*********************");
		}else {
			System.out.println("*********************Person Info*********************");
		}
	System.out.println(p);
	System.out.println(p.getDatails());
	System.out.println("*****************************************");
	
	}
	
	

}

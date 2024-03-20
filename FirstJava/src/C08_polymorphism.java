
/*다형성
*  - 여러가지 형태를 가지는 성질을 의미함.
*  -다형성은 상속을 전제조건으로 함.
*  -동일한 메시지라도 어떤 객체에 전달되느냐에 따라서 다양한 동작을 발생하게 된다.
*  이것은 프로그램에서 유연성을 부여하는 역할을 합니다.
*   -다형성은 존재하지 않았던 클래스를 기존 시스템에 수정없이 시스템에 추가되도록 합니다.
*   (다형성 인자 예제)
*    - 다형성을 적용하는 방법은 부모클래스의 객체를 선언하고, 자식클래스의 객체를 할당하는 것.
*    반대의 경우에는 불가능
*    =다형적 객체의 경우 부모 클래스에 있는 메서드만 사용이 가능함.
*    자식클래스에 재정의 되오 있다면 실행은 자식클래스에 있는 메서드로 실행된다.
*    -자식클래스의 메서드가 실행된다고해서 부모 클래스에 있는 해당 메서드를 지우면 안된다.
*    이유는 컴파일 시에는 부모의 메서드를, 실행시에는 자식의 메서드를 사용하기 때문.
*    -선언시 자료형은 반드시 구현된 클래스일 필요는 없다. 추상클래스나 인터페이스도 가능하고,
*    이런 특성을 이용하여 개발자는 인터페이스를 통해서 명세를 제공할 수 있다.
*  
*
*
*
*
*
*
*
*/

import obj.inheritance.Person;
import obj.inheritance.goodcase.Employee;
import obj.inheritance.goodcase.Student;
import obj.inheritance.goodcase.Teacher;

public class C08_polymorphism {

	public static void main(String[] args) {
		//다형성 테스트
		Person p = new Student("홍길동", 17, "20240315","도술"); //부모클래스에 자식 클래스를 집어넣는것 //업캐스팅
		//오버라이드 된 메서드의 실행
		System.out.println(p.getDatails());  //오버라이드 된 자식의 출력
		Person pO  = new Person("이순신", 40);
		System.out.println(pO.getDatails()); //부모클래스를 직접 불러도 자식의 내용을 출력 //오버라이드 된 내용은 자식의 내용을 출력
		p.walk();//상속받은 메서드 실행.
//		p.study;		//p는 다형적 객체이기 때문에 부모 클래스에 있는 메서드만 가능하다.
		Student casting = (Student)p;	//다운캐스팅.
		//study() 사용해야 하는 경우에는 Student로 캐스팅이 되어야 사용이 가능하다.
		casting.study();
		
		
		///예제
		Person p2;
		p2 = new Teacher("홍선생", 22, "Java programming!!");
		// instanceof 연산자는 좌항의 객체와 우항의 클래스를 비교. (어느 클래스에 속해있는지) 정확히는 클래스에 속해 있는게 맞는지.
		System.out.println(p2 instanceof Person);		//p2 와 person 비교
		System.out.println(p2 instanceof Teacher);		//p2와 Teacher 비교
		System.out.println(p2 instanceof Student);		//p2와 Student 비교
		System.out.println(p2.getDatails());
		
		p2 = new Employee("홍사원", 25, "교무처");
		// instanceof 연산자는 좌항의 객체와 우항의 클래스를 비교. 정확히는 클래스에 속해 있는게 맞는지.
		System.out.println(p2 instanceof Person);		//p2 와 person 비교
		System.out.println(p2 instanceof Employee);		//p2와 Employee 비교
		System.out.println(p2 instanceof Student);		//p2와 Student 비교
		System.out.println(p2.getDatails());
		
		p2 = new Student("홍길동", 17, "20240315","도술");
		System.out.println(p2 instanceof Person);		//p2 와 person 비교		//부모와 묶여있는지 나와 형제 
		System.out.println(p2 instanceof Employee);		//p2와 Employee 비교
		System.out.println(p2 instanceof Student);		//p2와 Student 비교		// 자기 자신.	나와 형제는 특징이 다르다.
		System.out.println(p2.getDatails());
	}

}

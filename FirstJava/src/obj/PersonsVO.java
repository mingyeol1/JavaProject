package obj;

public class PersonsVO {
			// VO 클래스 or DTO 클래스
			// VO클래스(Value Object Class) - 객체에 값을 저장한 형태. DB나 데이터 저장 용도로 사용
			//								변수둘의 모음 역할.
			//DTO클래스(Data Transfer object Class) -데이터 전송 처리를 위한 값을 저장하는 형태의 객체
	
	//멤버 변수 선언 - 필드, 속성
	private int id;
	private String firstname;
	private String lastname;
	private int age;
	private String city;
	
	//기본 생성자
	public PersonsVO() {}

	
	//필드 생성자(필드값 초기화 생성자)
	public PersonsVO(int id, String firstname, String lastname, int age, String city) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.city = city;
	}

	//Getter, Setter
	
	public int getId() {
		return id;
	}


	public String getFirstname() {
		return firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public int getAge() {
		return age;
	}


	public String getCity() {
		return city;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "PersonsVO [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age
				+ ", city=" + city + "]";
	} 



}

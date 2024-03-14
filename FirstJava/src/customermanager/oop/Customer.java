package customermanager.oop;

public class Customer {
	
	//멤버 변수(속성)
	private String name; 							//클래스 내에서는 확인이 가능하나 클래스 밖에서는 안됨
	private String gender;
	private String email;
	private int birthYear;
	
	public Customer() { } //기본생성자


	public Customer(String name, String gender, String email, int birthYear) { //필드생성자)(멤버 초기화 생성자)
		super();
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthYear = birthYear;
	}
	
	//Getter, Setter(메서드에 직접 입력함)
	
	public String getName() {
		return name;		//이름값을 넘겨줌.
	}

	public String getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", gender=" + gender + ", email=" + email + ", birthYear=" + birthYear + "]";
	}

	
	









}

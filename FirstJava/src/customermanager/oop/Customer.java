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

	//equals()를 Override하여 비교할 수 있게 만들기

	public boolean equals(Object obj) { 
		//동일 객체 확인
		if(this == obj) { 
			return true;
		}
		//null값 확인
		if(obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Customer other = (Customer)obj;
		if(name == null) {
			if(other.name != null) {
				return false;
			}
		}else if(!name.equals(other.name)) return false;
		if(!gender.equals(other.gender)) return false;
		if(!email.equals(other.email)) return false;
		if(!(birthYear == other.birthYear)) return false;
	
		return true;
	}
	









}

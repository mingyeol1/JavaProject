package review;

public class PersonsVO {
	
	private int id;
	private String firstname;
	private String lastname;
	private int age;
	private String city;
	
	public PersonsVO() {}

	public PersonsVO(int id, String firstname, String lastname, int age, String city) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "[id=" + id +  ", firstname=" + firstname + ", lastname=" + lastname
				+ ", age=" + age + ", city=" + city + "]";
	}
	
	

}

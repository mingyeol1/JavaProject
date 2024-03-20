import java.util.DuplicateFormatFlagsException;

class Member{
	String name;
	String phone;
	String address;
	
	
	public Member(String name, String phone, String address) {//필드생성자.
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
}

public class D09_userDefineExceptionEx {

	public static void main(String[] args) {
		D09_userDefineExceptionEx memberManger = new D09_userDefineExceptionEx();
		try {
			memberManger.insert(new Member("홍길동","010-1223-2836","서울시 마포구"));
		}catch (DuplicateKeyExcption e) {
			System.out.println(e.toString());
		}

	}
	public void insert(Member member) throws DuplicateKeyExcption{
			System.out.println("고객정보를 저장합니다.");
			System.out.println(member.name+"님의 정보");
			//디비에 홍길동/010-1223-2737 정보가 있다고 간주.
			if("홍길동".equals(member.name) &&"010-1223-2836".equals(member.phone)) {
			// 이 경우에 DB에는 이미 정보가 있는 경우가 된다.
			// 이때 예외를 발생 시켜서 insert메서드를 호출한 곳으로 데이터가 중복됨을 알린다.
			throw new DuplicateKeyExcption("데이터가 중복된다.");
			}else {
				System.out.println("데이터 베이스에 저장되었다");
			}
	}

}
@SuppressWarnings("serial")
//사용자 정의 예외.
class DuplicateKeyExcption extends Exception{
	
	
	public DuplicateKeyExcption(String message) {
		super(message);
	}
}

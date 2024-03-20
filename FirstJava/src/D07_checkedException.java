import java.io.IOException;

public class D07_checkedException {

	public static void main(String[] args) {
		//checkedException은 예외처리해야함. 잘못된 값이 들어와서 예외발생 가능.
		System.out.println("값을 입력받는 프로그램이다.");
		
		byte[] data = new byte[100]; //한번에 100byte 처리할 공간.
		try {
		System.in.read(data);
		}catch (IOException e) {
			e.printStackTrace();	
			}
		System.out.print("입력할 문자열은 : ");
		System.out.println(new String(data).trim()); //100바이트가 넘으면 입력값이 깨짐. //한글은 1글자당 2바이트
			
		
	}

}

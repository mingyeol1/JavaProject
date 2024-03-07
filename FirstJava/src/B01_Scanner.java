import java.util.Scanner;

// import 외부 클래스를 이 파일에 가져와 사용하겠다는 의미
// java.util.Scanner : java패키지 내부에 util패키지에 들어 있는 Scanner클래스를 사용하겠다
// ctrl + Shift + O : Eclipse의 자동 import 단축키

public class B01_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner 클래스로 객체를 하나 생성, 변수에 보관하여 작업
		// 클래스는 데이터 타입.
		Scanner scan = new Scanner(System.in);
		
		// Scanner는 사용자의 입력을 기다리고, 입력한 문자열을 한줄 읽어들임.
		System.out.print(">> ");
		String line = scan.nextLine(); // 문자열을 입력받는다.   line에 입력                  //참조형 타입에 변수에 "."을 찍은 후에 해당 참조형을 참조
		System.out.println("사용자가 입력한 문자열 : "+line);    //출력.
		
		
		
		//참조형 타입 변수에 . 을 찍고, ctrl + space로 그 타입에 사용할 수 있는 기능(함수(메서드)들)을 볼 수 있음.
//		System.out.print("has next boolean : ");
//		boolean b = scan.hasNextBoolean();
//		System.out.println("boolean 포함 여부 : " + b);
		
		
		//사용자 입력값을 기다리면서 정수값을 처리하는 방식.
		System.out.print("아무 정수 값이나 입력해 보세요 : ");
		int num = scan.nextInt();
		System.out.println("사용자가 입력한 정수 : "+num);
		System.out.println("사용자가 입력한 정수로 만든 char : "+(char)num);
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

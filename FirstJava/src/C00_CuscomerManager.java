import java.util.Scanner;

public class C00_CuscomerManager {

	//고객정보를 저장 할 수 있는 배열 지정
	static final int MAX = 100; //final 한번 입력된 값은 변경이 안됨. 상수.
	
	//고객 정보를 저장할 변수를 배열로 선언.  : 이름, 성별,  이메일, 출생년도. //메인메소드에서 불러다가 쓸 수 있도록 하기 위해 static을 씀
	static String[] nameList = new String[MAX];	 	//이름 저장
	static String[] genderList = new String[MAX]; 	//성별 저장
	static String[] emailList = new String[MAX]; 	//이메일저장
	static int[] birthYearList = new int[MAX]; 		//출생년도 저장
	
	//배열을 참조하기 위해서 인덱스가 필요함
	static int index = -1; //배열의 인덱스 시작은 0부터, 때문에 최소 인덱스는 -1이 되어야함 . 0이되면 없는데 참조하는 거임. 0이나 양수가 들어갈 수 없음.
	
	//배열의 처음 선언한 크기보다 같거나 작은 갯수의 자료를 저장
	// 때문에 현재 데이터가 몇개 저장되어 있는지 알 수 있는 변수가 필요하다.
	static int count = 0; //저장 개수
	
	//기본 입력 장치로부터 데이터를 입력 받기 위해서 Scanner 객체를 생성
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//고객 관리 프로그램 메뉴
		
		while(true) {
			//고객 메뉴 ui(TEXT UI)
			System.out.printf("\n[INFO] 고객수 : %d, 인덱스 : %d\n",count, index);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate, (D)elete, (Q)ult");
			System.out.print("메뉴 입력 : ");
			String menu = scan.next();
			menu = menu.toLowerCase(); //문자열에 대소문자 구문을 없애는 기능. 대문자로 출력하는것도 있음 
			//메뉴 선택시 동작을 구현.
			switch(menu.charAt(0)) {
			
			case 'ㅑ': //한글일 경우도 있으니 적어줌
			case 'i': //insert
				System.out.println("고객 정보를 입력을 시작합니다.");
				if(count >= MAX) {
					System.out.println("더 이상 저장할 수 없습니다.");
				}else {
					//저장을 위한 메서드
					insertCustomerData();
					System.out.println("고객 정보를 저장했습니다.");
				}
				break;
			case 'ㅔ':
			case 'p': //previous
				System.out.println("이전 데이터를 출력합니다.");
				if(index <= 0) { //이전 데이터가 존재하지 않는 경우
					System.out.println("이전 데이터가 존재하지 않습니다.");
				}else {
					index --;
					printCustomerData(index);
				}
				break;
			case 'ㅜ':
			case 'n':
				System.out.println("다음 데이터를 출력합니다.");
				if(index >= count - 1) {
					System.out.println("다음 데이터가 존재하지 않습니다.");
				}else {
					index ++;
					printCustomerData(index);
				}
				break;
			case 'ㅊ':
			case 'c':
				System.out.println("현재 데이터를 출력합니다.");
				if((index >= 0)&&(index <count)) {
					printCustomerData(index);
				}else {
					System.out.println("출력할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'ㅕ':
			case 'u':
				break;
			case 'ㅇ':
			case 'd':
				break;
			case 'ㅂ':
			case 'q': //종료
				System.out.println("프로그램을 종료합니다.");
				scan.close();
				System.exit(0); //프로세스 종료  //프로그램이 실행된게 프로세스라고 부름.   f2누르고 동그라미 보면 초록색 동그라미는 메소드란뜻 빨간색 s는 static이란 뜻
				break;																	//c는 클래스 
			default :  //default는 다음이 없음											//세모는 디폴트
				System.out.println("메뉴를 잘못 입력했습니다. 다시 선택해주세요.");
				
				
				//break; //생략이 가능함.
			
			}
		
		}
		
		
		
		
		
		
		
	}

	public static void insertCustomerData() {
		// 이름, 성별 , 이메일, 출생년도 입력받음.
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("성별 : ");
		String gender = scan.next();
		System.out.print("이메일 : ");
		String email = scan.next();
		System.out.print("출생년도 : ");
		int birthYear = scan.nextInt();
		
		//고객 객체를 배열에 저장.
		nameList[count] = name;
		genderList[count] = gender;
		emailList[count] = email;
		birthYearList[count] = birthYear;
		count ++; //count번째 배열에 객체 저장후에 count값 증가.
		
	}
	
	public static void printCustomerData(int index) {
		System.out.println("===========CUSTOMER INFO============");
		System.out.println("이름 : "+nameList[index]);
		System.out.println("성별 : "+genderList[index]);
		System.out.println("이메일 : "+emailList[index]);
		System.out.println("출생년도 : "+birthYearList[index]);
		System.out.println("=====================================");
	}
	public static void updateCustomerData(int index) {
		System.out.println("-----------UPDATE CUSTOMER INFO-------------");
		System.out.print("이름("+nameList[index]+") : ");
		String name = scan.nextLine();
		if(name.length() != 0) {		//name을 입력했는지 안했는지 검증
			nameList[index] = name;
		}
		System.out.print("성별("+genderList[index]+") : ");
		genderList[index] = scan.next();
		System.out.print("이메일("+emailList[index]+") : ");
		emailList[index] = scan.next();
		System.out.print("출생년도("+birthYearList[index]+") : ");
		birthYearList[index] = scan.nextInt();
	}
	
	public static void deleteCistomerData(int index) {
		for (int i = index; i < count -1; i++) {
			nameList[i] = nameList[i + 1];
			genderList[i] = genderList[i + 1];
			emailList[i] = emailList[i + 1];
			genderList[i] = genderList[i + 1];
		}
	count--;
	}

}



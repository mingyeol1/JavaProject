import java.util.Arrays;

public class B09_arrayExample1 {

	public static void main(String[] args) {
		// 배열
		//같은 타입의 변수를 한번에 여러개 선언하는 방법.
		
		//배열의 선언 방법.
		//1. 타입[] 변수명 = new 타입명[배열의길이];
		//2. 타입[] 변수명 = {데이터들}; //동종이여야 함 다른 타입의 배열x
		//3. 타입[] 변수명 = new 타입명 [] {데이터들};
		
		
		
		int[] numbers = new int[10]; //정수 10개의 변수를 저장할 수 있는 배열
		boolean[] win = {true, false, false, false, true}; //boolean타입의 변수 5개 지정 및 초기화.
		String[] welcome = new String[] {
				"오늘 뭐 드셨어요?", //인덱스 0
				"오늘 저녁에 비온데요... 근데 우산이 없어요..", //인덱스1
				"졸리죠?"//인덱스 2
		};
			//배열의 인덱스 : 배열에 지정된 값을 불러올 때에 인덱스 값을 사용 //배열과 문자열은 참조타입. //문자열 = char
			// 				인덱스 값은 시작값이 0부터
		System.out.println(welcome[0]);
		System.out.println(welcome[1]);
		System.out.println(welcome[2]);
		System.out.println("welcome 배열의 길이 : "+welcome.length);  //.length 문자열의 길이
		System.out.println("numbers 배열의 길이 : "+numbers.length);
		System.out.println("boolean 배열의 길이 : "+win.length);
		System.out.println("문자열의 길이"+welcome[1].length());
		
		//문자열 배열
		char[] s;				//배열 선언
//		char[5] s2;				//배열 선언시 오류... [] 숫자의 의미는 배열의 길이로 생각하고 쓸수 없다.
								//배열 선언시 크기를 명시하지 못한다.
	
	s = new char[5];			//배열의 길이로 선언시 초기화 값이 없는 경우 char는 "\0000"값으로 초기화.
	s[0] = 'A'; s[1] = 'B'; s[2] = 'C'; s[3] = 'D'; s[4] = 'E';
	
	for(int i = 0; i < s.length; i++) {
		System.out.print(s[i]);
	}
		System.out.println();
		
		//문자열은 문자의 배열과 비슷하다.
		System.out.printf("%s", Arrays.toString(s));
		System.out.println();
		System.out.printf("%s", String.valueOf(s));
	
	
	
	//*** Enchanced For문(강화된 for문)
	/*
		(형식)
		for (타입 변수명: 배열명){  **배열명으로 불러오는 배열의 타입은 : 이전의 타입과 같아야 함.
		반복시 실행할 명령문
		}
		
	*/
		
		System.out.println("\n\n강화된 for를 이용한 반복 처리");
		for(String str : welcome) { //welcome은  String[]  이기 때문에 String str로 받게 됨.
			System.out.println(str);
		}
	
		for(boolean result: win) {
			System.out.println("승률 : "+(result ? "승" : "패"));
		}
		
		for(int i = 0; i<win.length; i++) {
			if(win[i]) {
				System.out.println(i+1 +"번째 전적 : 승리");
			}else {
				System.out.println(i+1+"번째 전적 : 패배");
			}																								//0o : 8진수       /     0x 16진수
		}
		
		System.out.println("배열의 내용출력 : Arrays.toString() 메서드를 사용");
		System.out.println(welcome);
		System.out.println(Arrays.toString(welcome));
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(win));

		//배열 선언시 자동적으로 기본값으로 초기화.
		//(기본형 : 정수 : , 실수 : 0.0, boolean : false,) (참조형 : null(String 등))
		String[] byeMessage = new String[10];
		System.out.println(Arrays.toString(byeMessage)); //배열은 어떤 값들을 고정하기 위해  
		
		//배열의 복사
		// 배열의 (앝은 복사(shallow copy)//어떤 위치의주소값만 가져옴)//와 (깊은 복사(deep copy)// 값 그 자체를 가져옴)
		String[] byeMessage2 = new String[] {"good bye", "bye bye", "see you"};
		
		//1. 얕은 복사는 byeMessage 변수에 byeMessage2의 주소값을 대입
//		byeMessage = byeMessage2; //얕은복사
//		byeMessage[1] = "hello bye bye";
//		System.out.println(Arrays.toString(byeMessage));
//		System.out.println(Arrays.toString(byeMessage2));
		
		//2. 깊은 복사(Deep copy)
		//System.arraycopy(src, srcPos, destPos, length)
		//src : 원본 배열의 이름
		//srcPoc : 복사를 시작할 원본의 위치(인덱스)
		//dest : 붙여넣기할 배열의 이름
		//destPos : 붙여넣기를 시작할 위치를 설정(인덱스)
		//length : 복사를 몇개나 할 것인지 결정
		
		
		System.out.println("복사 전 : "+Arrays.toString(byeMessage));
		System.arraycopy(byeMessage2, 1, byeMessage, 5, 2);
		
		System.out.println("복사 후 : "+Arrays.toString(byeMessage));
		System.out.println("복사 후 : "+Arrays.toString(byeMessage2));
		
		byeMessage[0] = "good bye!!!!!!!";
		
		System.out.println("복사 후 : "+Arrays.toString(byeMessage));
		System.out.println("복사 후 : "+Arrays.toString(byeMessage2));
				
	
		//깊은 복사를 통해서 beyMessage에 beyMesaage2에 있는 배열의 값을 모두 복사하려고 한다면.
		System.arraycopy(byeMessage2, 0, byeMessage, 0, byeMessage2.length); //모두 복사.
		System.out.println("모두 복사 : "+Arrays.toString(byeMessage)); //  배열 :  저장공간을 선언
		
	
	}


}

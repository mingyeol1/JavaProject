package quiz;

import java.util.Scanner;

public class Quiz_240308_AM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//===========================================================================		
		// quiz-1
		// 1 ~ 101미만의 임의 정수를 생성하고, 그 숫자가 짝수인지 홀수인지 출력하세요. (3항 연산식을 사용)

		
//		 int ran1 = (int)(Math.random()*101);
//		 
//		 내가만든 
		
		
//		 if(ran1 % 2 == 0) 
//		 { System.out.println("짝"); 
//			System.out.println(ran1); }
//		 else
//		  { System.out.println("홀");
//			System.out.println(ran1); }
//		  
		//강사님이 만든
		
		
		int num = (int)(Math.random()*100) + 1;
		System.out.println("랜덤수는 : "+num);
		System.out.println("3항 연산의 결과 : "+(num%2 == 0?"짝수" : "홀수" ));
		
		
		
		
		//===========================================================================				 

		// quiz-2
		// -5 ~ 5 사이의 임의의 정수를 생성하고, 3항 연산식을 사용하며 절대값을 출력하세요
		// 0 <= x <= 10 , y가 -5 <= y <= 5의 식을 구하세요     >  5 - x = y
		
//		int num2 = 5 - (int)(Math.random()*11);
//		System.out.println("랜덤수는 : "+num2);
//		int abs = (num >= 0 ? num2 : -num2); //-num2 => num2 * -1
//		System.out.println(num2+"의 절대값은 :" +abs);

//		int ran1 = 5 - (int) (Math.random() * 11);
		//===========================================================================		
		// quiz-3
		// 정수를 입력받아 그 수가 짝수인지 홀수 인지 출력하는 프로그램을 작성하세요. (3항연산자를 사용)

		Scanner scan = new Scanner(System.in);

		
		
		//	int num2 = scan.nextInt();
//	
//	내가 만든
//	
//	if(num2 % 2 == 0) {
//		System.out.println("짝");
//		System.out.println(num2);
//		}
//		else {
//			System.out.println("홀");
//		System.out.println(num2);
//		}
		
//		강사님이 만든
		
		
//		System.out.println("정수를 입력하세요 : ");
//		int num3 = scan.nextInt();
//		String result = num3%2 == 0? "짝수" : "홀수";
//		System.out.println("입력받은 "+num3+ "은"+result);
//			
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//===========================================================================			
		

		// quiz-4
		// 키와 나이를 입력받아서 놀이기구에 탑승 여부를 결정하는 프로그램을 작성하세요
		// (조건 : 키 - 140 이상, 나이는 8살 이상.)

//		double height = scan.nextDouble();
//		int age = scan.nextInt();
//
//		if (age >= 8) {
//			System.out.println("탑승이 가능합니다.");
//		}	
//		else if (age < 8) {
//			System.out.println("탑승이 불가합니다.");
//		}
//		else if (height >= 140) {
//			System.out.println("탑승이 가능합니다.");
//		} else if (height < 140) {
//			System.out.println("탑승이 불가합니다.");
//		}

		
		
//		
		System.out.println("키와 나이를 입력하세요");
		System.out.printf("키 : ");
		double height = scan.nextDouble();
		
		System.out.printf("나이 : ");
		int age = scan.nextInt();
		System.out.println("==============================");
		if(height >= 140) {
			if(age >= 8) {System.out.println("탑승 가능합니다.");
		}else {System.out.println("불가능합니다.");
		}
			}else {
				System.out.println("탑승이 불가.");
			} 
//		
//		
		
	
		
		
		
		
		
		
		
		
		
		//===========================================================================		
		
		
		
		
		
		// quiz-5
		// 정수 두개를 입력받아서 큰수를 출력, 같은 경우에는 같다고 출력하는 프로그램을 작성하세요.
		
//		int num5 = scan.nextInt();
//		int num4 = scan.nextInt();
		
//		System.out.println("정수 두개를 입력하세요");
//		System.out.printf(">");
//		int num51 = scan.nextInt();
//		
//		System.out.printf(">");
//		int num52 = scan.nextInt();
//		
//		if (num51 == num52) {
//			System.out.println("같은 수 입니다.");
//		}else if(num51 > num52) {
//			System.out.println(num51 + "가 큰 수 입니다.");
//		}else {
//			System.out.println(num52+ "가 큰 수 입니다.");
//		}
		
		//===========================================================================		
		// quiz-6
		// 정수를 입력받아서 양의 정수인 경우에는 짝수, 홀수를 구분하고, 0이면 0입니다를 출력
		// 음수인 경우에는 음의 정수입니다를 출력하는 프로그램을 작성하세요.

		
		//		System.out.println("정수를 입력하세요");
//		System.out.print("> ");
//		int num6 = scan.nextInt();
//		if(num6 > 0) { // 양의 정수
//			if(num6%2 == 0) System.out.println(num6 + "은 짝수입니다.");
//			else System.out.println(num6 + "은 홀수입니다.");
//		}else if(num6 == 0 ){  //0인경우
//			System.out.println("입력한 정수는 0입니다.");
//		}else { //음의 정수
//			System.out.println(num6 + "은 음의 정수 입니다.");
//		}
//		
//		
		
		//===========================================================================		
		
		
		
		
		
		// quiz-7
		// switch를 사용하여 수박, 사과, 멜론, 포도, 귤을 구매시 가격을 출력하는 프로그램을 작성하세요.
		
//		System.out.println("구매한 메뉴는?");
//		System.out.println("[수박, 사과 ,멜론, 포도 , 귤]");
//		System.out.print(">>  ");
//		String fruit = scan.next();   //단어는 next    //문자는 nextLine
//		
//		
//		switch(fruit) {
//		case "수박":
//			System.out.println(fruit + "의 가격은 2만원 입니다.");
//			break;
//		case "사과":
//			System.out.println(fruit + "의 가격은 3만원 입니다.");
//			break;
//		case "멜론":
//			System.out.println(fruit + "의 가격은 4만원 입니다.");
//			break;
//		case "포도":
//			System.out.println(fruit + "의 가격은 5만원 입니다.");
//			break;
//		case "귤":
//			System.out.println(fruit + "의 가격은 6만원 입니다.");
//			break;
//		default:
//				System.out.println(fruit + "의 메뉴에 없습니다.");
//				System.out.println(fruit + "다시 입력 해주세요.");
//				break;
//		}
		scan.close(); //스캔기능 해제
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

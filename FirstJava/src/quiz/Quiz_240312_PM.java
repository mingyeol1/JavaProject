package quiz;

import java.util.Scanner;

public class Quiz_240312_PM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 소수(PrimeNumber) 구하기
		//   소수는 1과 자기 자신만으로 나누어지는 수를 말함. 
		//   조건문과 반복문을 사용하여 100이하의 소수를 출력해 보세요
		//   (for문 안에 for문)
//		System.out.print("소수 범위 : ");
//		int prime = 0;
//		
//		for(int i =2; i <=100; i++) {
//			for(int j = 2; j <= i; j++) {
//				if(i%j == 0) {
//					prime++;
//				}
//			}
//			if(prime==1) {
//				System.out.println(i);
//			}
//			prime=0;
//		}
		
		System.out.println("========Prime Number========");
		int cnt; //소수 판별 여부를 위해 선언.  //배수확인. 
		for(int i = 2; i < 100; i++) {
			cnt = 0; //배수여부 확인.
			for(int j = 1; j <= i; j++) {
				if(i % j == 0){//i를 j로 나머지연산
					cnt++;						
				}
			}
			//소수인 경우
			if (cnt == 2) System.out.print(i + " ");   //복습.
		}
		System.out.println();
		
		
		// 2. 단어 거꾸로 출력하기(reverse 출력)
		//   자바의 Scanner 객체를 이용하여 콘솔에 데이터를 입력
		//   입력된 데이터를 for문을 사용하여 거꾸로(reverse) 출력하세요
		//   (String.charAt(index)를 사용)
//		System.out.println("========입력 값 거꾸로 출력하기==========");
//		String str =scan.nextLine();
//		String reverse = "";
//		for(int i =str.length(); i > 0; i--) {
//			reverse += str.charAt(i-1); //역으로 읽어서 reverse 대입하기 위해          //여기서 거꾸로 대입이 시작이 됨.
//			System.out.print(str.charAt(i-1));
//		}
//		System.out.println(); //줄바꿈
//		System.out.println("거꾸로 문자열 : "+ reverse);
//		scan.close();
//		
//		System.out.println();
//		

		// 3. 로또 번호 추출하기
		//   앞서 배운 난수를 활용하여, 중복되는 번호 없이 1 ~ 45까지의 숫자 중
		//   6개의 숫자를 랜덤추출하고, 콘솔에 출력하세요. 
		//   (while문에 for)
		
		System.out.println("==========로또 추출===========");
		int[] lotto = {0, 0, 0, 0, 0, 0};
		
		int index = 0;   //for문은 랜덤값이지만 중복값이 발생할 수 있음.
		
		while(true) {
			//랜덤 값 생성
			int rand =(int)(Math.random()*45)+1;
			int i =0;  //초기값 //index와 값을 비교하기 위해서
			for(i =0; i < index; i++) {
				if(rand == lotto[i]) {  //추첨된 번호가 중복되면 멈춘다.     
					break;
				}
			}
			if(index == i) { //추첨된 번호가 lotto에 없다.
				lotto[index++] = rand;
			}
		if(index > 5) break; //6ㅐ 번호 추출 끝
		}
		for (int i =0; i <lotto.length; i++) {
			System.out.print(lotto[i]+", ");
		}
		
		System.out.println();
		
		
		// 4. 대문자가 입력된다면 소문자로 출력하고, 
		//   소문자가 입력된다면 대문자로 출력하는 프로그램을 작성해보세요
		
//		System.out.println("글자를 입력하세요 : ");
//		String sf = scan.nextLine();
//		sf = sf.toLowerCase();
//		System.out.println("출력된 글자 : "+sf);
		System.out.println("==============대소문자 바꾸기===============");      //아스키코드 0~32까지는 특수한 제어문자. //아스키코드는 통신데이터 알아두는게 좋음.  
		System.out.print(">>  : ");
		char ch = scan.nextLine().charAt(0); //char(0)
		if(ch >= 'A' && ch <= 'Z') {
			ch = (char)(ch - 'A' + 'a');         //(char)(ch + 32) 도 가능
		}else if (ch >= 'a' && ch <= 'z') {
			ch = (char)(ch - 'a' + 'A');
		}
		System.out.println(ch);
		
		
		//문자열을 대문자 문자열로  변경  String.toUpperCase
		//문자열을 소문자 문자열로  변경  String.toLowerCase
		System.out.println("Hello World".toUpperCase());
		System.out.println("Hello World".toLowerCase());
		
		// 5. 커피의 가격은 2000원, 10개 이상 구매하면 초과분에 대해서 
		//   커피는 1500원을 받는다. 
		//   커피의 개수를 입력받고, 총 가격이 얼만인지 계산하여 출력하는 
		//   프로그램을 만들어보세요!
		System.out.println();
		
//		System.out.print("커피 개수 입력. > : ");
//		int num = scan.nextInt(); 
//		int cafe = num*2000;
//		
//		if(num >= 10) {
//			cafe = num*1500;
//		}
//		System.out.println("커피의 가격 : "+cafe);
//		
		
		System.out.println("========커피 값 계산 프로그램=========");
		System.out.println("갯 수 : ");
		int qty = scan.nextInt(); //커피 갯 수
		int price = 0; //커피가격
		int normal_price = 2000; //할인 없는가격
		int discount_price = 1500; //할인이 있는가격
		
//		if(qty > 10) {
//			price += (10 * normal_price) + (qty - 10) * discount_price;
//		}else {
//			price += qty * normal_price;
//		}
//		System.out.println("커피 가격은"+ price+"원 입니다.");
		
		
		switch (qty /10) {
		case 0:  //10잔 미만
			price += qty * normal_price;
			break;
		default: //10잔 이상인 경우
				price += (10 * normal_price) + (qty - 10) * discount_price;
				break;
		}
		System.out.println("커피 가격은"+ price+"원 입니다.");
		
		
		// 6. 램덤으로 알파벳 대문자 50개 생성하여 출력하는 프로그램을 만들어 보세요. 
		//   출력은 10줄 마다 줄바꿈해서 출력되게 해주세요. 
		//   예> 	DEFDEGSDFE
		//       	ADEFSGESGS
		//          ...
	
	
	int symbol_size = 'Z' - 'A' + 1;  //+1를 하는 이유는 아스키값으로 계산 했을 때 영문자가 안나옴.
	for(int i = 0; i < 50; i++) {
		char ch6 = (char)(Math.random()*symbol_size + 'A');
		System.out.print(ch6);
		if(i % 10 == 9) System.out.println();
	}
	
	
	
	
	
	
	
	
	
	}

}

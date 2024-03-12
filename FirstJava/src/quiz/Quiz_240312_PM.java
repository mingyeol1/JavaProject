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
		
		
		
		// 2. 단어 거꾸로 출력하기(reverse 출력)
		//   자바의 Scanner 객체를 이용하여 콘솔에 데이터를 입력
		//   입력된 데이터를 for문을 사용하여 거꾸로(reverse) 출력하세요
		//   (String.charAt(index)를 사용)

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
		
		
		
		// 4. 대문자가 입력된다면 소문자로 출력하고, 
		//   소문자가 입력된다면 대문자로 출력하는 프로그램을 작성해보세요
		
		System.out.println("글자를 입력하세요 : ");
		String sf = scan.nextLine();
		sf = sf.toLowerCase();
		System.out.println("출력된 글자 : "+sf);
		
		
		// 5. 커피의 가격은 2000원, 10개 이상 구매하면 초과분에 대해서 
		//   커피는 1500원을 받는다. 
		//   커피의 개수를 입력받고, 총 가격이 얼만인지 계산하여 출력하는 
		//   프로그램을 만들어보세요!
		
		
//		System.out.print("커피 개수 입력. > : ");
//		int num = scan.nextInt(); 
//		int cafe = num*2000;
//		
//		if(num >= 10) {
//			cafe = num*1500;
//		}
//		System.out.println("커피의 가격 : "+cafe);
//		
		
		
		
		
		
		
		
		
		// 6. 램덤으로 알파벳 대문자 50개 생성하여 출력하는 프로그램을 만들어 보세요. 
		//   출력은 10줄 마다 줄바꿈해서 출력되게 해주세요. 
		//   예> 	DEFDEGSDFE
		//       	ADEFSGESGS
		//          ...
	}

}

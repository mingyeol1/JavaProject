package quiz;

public class Quiz_star1_240311 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for문을 이용하여 다음과 같이 별찍기를 진행.
		
		/*
	     1)*     2)***** 3)    *     4)*****   
	       **      ****       **        ****
	       ***     ***       ***         ***
	       ****    **       ****          **
	       *****   *       *****           *
	    */
	//내가한 피라미드.	
		
//		for(int i = 0; i < 6; i++) {
//			System.out.println();
//			for(int j = 1; j <= i; j++) {
//				System.out.printf("*");
//				}
//			}
//	
//		
//		System.out.println("==================================");
//		for(int i = 0; i <= 5; i++) {
//			System.out.println(" ");
//			for(int j = 5; j > i; j--) {
//			System.out.print("*");
//			}
//		}
		
		//강사님. 피라미드.                                         ㅡㅡㅡㅡㅡㅡ이쪽 오 상위포문
		//1)														||||||||||이쪽 열 하위포문
		int dan = 5;
		for(int i = 0; i < dan; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
		}
		System.out.println("===========================================");
		//2)
		for(int i = 0; i < dan; i++) {
			for(int j = 0; j < dan - i; j++) {
				//for(int j = dan; j > 0; j--) 이것도 됨.
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
		}
		//3)
		System.out.println("============================================");
		for(int i = 0; i < dan; i++) {
			//space를 찍기
			for(int j = 0; j < dan -i - 1; j++)
				System.out.print(" ");
			//별찍기.
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
		}
		System.out.println("============================================");
		//4)
		for(int i = 0; i < dan; i++) {
			//여백 찍기
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			//별 찍기
			for(int j = 0; j < dan - i; j++) {
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
		}
		
		
		
		
	}

}

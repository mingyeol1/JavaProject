package quiz;

import java.util.Scanner;

public class ForStarDiamond {

	public static void main(String[] args) {
	
		// 다이아몬드 찍기
		// 1. 다음과 같은 형태로 별직기를 진행해 보세요.  
		/*          힌트  : 공백, 별, 단(줄)
		      *
		     ***
		    *****
		   *******
		  *********
		   *******
		    *****
		     ***
		      *
		 */
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5-i; j++) {
				System.out.print(" ");
			}for(int j = 0; j < i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < 5; i++ ) {
			for(int j = 0; j < i+2; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2*4 -(2*i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 2. 1번의 코드를 활용하여 줄 수를 입력 받아서 그 줄 수 에 맞는 다이아몬드 별을 찍는 
 		//   프로그램을 작성해 보세요. (단, 줄은 홀수로만 입력 받아야 합니다.)

		Scanner scan = new Scanner(System.in);
		
		System.out.print(">> : ");
		int dan = scan.nextInt();
		for(int i = 0; i < dan; i++) {
			for(int j = 0; j < dan-i; j++) {
				System.out.print(" ");
			}for(int j = 0; j < i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < dan; i++ ) {
			for(int j = 0; j < i+1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2*dan -(2*i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
		
		
		
	}

}
package quiz;

public class Quiz_star2_240311 {

	public static void main(String[] args) {
		//피라미드찍기
		
		
//		int dan = 5;
//		for(int i = 0; i < dan; i++) {
//			for(int j = 0; j < dan-i ;j++) {
//				System.out.print(" ");
//			}
//			for(int j = 0; j <i * 2 + 1; j++) {
//				System.out.print("*");
//				}
//		System.out.println();
//		}
//		
//		
//		System.out.println("=====================");
//		
//		for(int i = 0; i < dan; i++) {
//			for(int j = 0; j < i; j++) {
//				System.out.print("&");}
//			
//				for(int j = 0; j < dan*2; j++) {
//				System.out.print("*");
//				}
//		System.out.println();	
//		}
		//===================================================
		int dan = 5;
		for(int i = 0; i < dan; i++) {
			// 여백 찍기
			for(int j = 0; j <dan -i -1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i*2+1; j++ ) {
				System.out.print("*");
			
			}
			System.out.println();
		}
		
		
		System.out.println();
		//#2
		for(int i = 0; i < dan; i++) {
			// 여백 찍기
			for(int j = 0; j <i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2*dan -(2*i)-1; j++ ) {
				System.out.print("*");
			
			}
			System.out.println();
		}
		
		
		
		

	}

}

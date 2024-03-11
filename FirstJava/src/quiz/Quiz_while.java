package quiz;

public class Quiz_while {

	public static void main(String[] args) {
		// while문을 이용하여
		//구구단을 다음과 같이 세로로 출력하라.
		
		
//		int j = 1;
//		int i = 2;
//		while(i < 10) {
//			while(j < 10){
//				System.out.print(i+"의 배수");
//				i++;
//				}
//			System.out.println(i+"x"+j+"="+(i*j));
//			j++;
//		}
			
		
		int gop = 0;
		while(gop <=9 ) { //상위루프문
			
			int dan = 2; //반복시 원래의 2(값)로 돌아와야 한다.
			
			while(dan <= 9) {  //하위 루프문
				if(gop == 0) {
					System.out.print(dan+ "단 \t");
				}else {
					System.out.printf("%dx%d=%d\t",dan,gop,dan*gop);
				}
				
				dan++;
			}
			System.out.println();  //줄바꿈
			gop++;
		}
		
		

	}

}

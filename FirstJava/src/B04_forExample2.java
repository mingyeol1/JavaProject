
public class B04_forExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이중(다중) for 구문
//		for(int i = 0; i < 10; i++) {
//			System.out.println("=================바깥 반복문"+ i) ;
//			
//			for(int j = 0; j < 10; j++) {
//				System.out.println("-----------------------안쪽 반복문"+i+"-"+j);
//				
//				for(int k = 0; k < 10; k++) {
//					System.out.println("++++ 제일 안쪽 반복문"+i+"-"+j+"-"+k);
//				}
//			}
//		}
//		
		
		
		
		
		//예제 1) 구구단 출력하기
		//2단부터 9단까지, 각 단은 1~9까지 
//		for (int x = 2; x < 10; x++) { //x단
//			System.out.print(x+"단 출력");	
//			for(int y = 1; y < 10; y++) {
//				System.out.print(" / "+x + " x " + y + " = " +(x*y));
//			}
//			System.out.println();
//		}
//		
		
//		for (int x = 2; x < 10; x++) { //x단
//			System.out.println(x+"단 출력");	
//			for(int y = 1; y < 10; y++) {
//				System.out.println(x + " x " + y + " = " +(x*y));
//			}
//			System.out.println();
//		}
		
		
		
	for(int y = 0; y < 10; y++) {
		for (int x = 2; x < 10; x++) {
			if( y == 0) System.out.print(x+"단 \t");
			else System.out.print(x + "x"+y + "=" +(x*y)+"\t");
		}
		System.out.println();
	}
		
		
		
		
		
		
		
	}

}

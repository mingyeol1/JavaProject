package quiz;

public class Quiz_240308_PM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 100부터 1까지 순서대로 출력해보세요.
//		for(int i = 100; i >= 1; i--) {
//			System.out.println(i);
//		}
		
		
		
		//2. 1에서 200사이의 수 중에서 2 또는 3의 배수가 아닌 수들의 총합.
		
//		int odd = 0;
//		for(int j = 1; j <= 200; j++) {
//			if(j%2 == 1) {
//				odd += j; 
//		}
//	 }
//		System.out.println("총합"+odd );
		
//		int sum = 0;
//		for (int i = 1; i <= 200; i++) {
//			if(!(i%2 == 0 || i%3 == 0)) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
//		
		
		//3. 1+ (1+2) +(1+2+3) + (1+2+3+4+) + (1+2+3+4+5) ......+(1+2+3+4+5+6+7+8+9+10)
		//의 결과를 구하시오
		
		
//		for(int k = 1; k <= 10; k++) {
//			System.out.println(k);
//		
//		
//		sum = 0;
//		int sum2 = 0;
//		for (int i = 1; 1<= 10; i++) {
//			if(i!=1) System.out.println("+(");
//			for (int j = 1; j <= i; j++) {
//				sum += j;
//				System.out.println(j);
//				if(j !=i) System.out.print("+");
//			}
//			if(i !=1) System.out.print(")");
//		}
		
		
		 int sum = 0;
		 int sum2 = 0;
		 for(int i = 1; i <= 10; i++) {
			 sum += i;
			 sum2 += sum;
		 }
		System.out.println(sum2);
		
		
		
		
		
		
		
		
		
		
	}

}

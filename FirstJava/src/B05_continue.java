import javax.swing.plaf.synth.SynthFormattedTextFieldUI;

public class B05_continue {

	public static void main(String[] args) {
		//continue
		//반복문 내부에서만 사용이 기능함.
		//반복문에서 continue를 만나면 아래의 내용을 실행하지않고, 다음 반복 회차로 이동.
		
//		// 1 ~ 100까지 짝수만 출력하기.
//		for(int i = 1; i <=100; i++) {
//			if(i % 2 == 1)     // i 의 초기값이 0일 경우 i == 0인 경우도 if조건에 넣어야함 
//				continue;
//			System.out.println(i);
//		}

	
	
	
	//continue로 5의 배수만 출력하는 예시
		
		
		for(int j = 5; j <= 1000; j++) {
			if(j % 5 != 0 || j == 0 )
				continue;
		System.out.println(j);
		}
		
	
	}

}

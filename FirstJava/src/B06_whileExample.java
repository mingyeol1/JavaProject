import java.util.Scanner;

public class B06_whileExample {

	public static void main(String[] args) {
		//while문
		// for문보다 조금 더 자유도가 높은 반복문
		//왜 ? for문(for(초기값; 조건; 증가값;))과 달리 while은 조건이 참 여부만 확인한다.
		
		
	/*
	(형식)
	whiie (condition){
		조건이 참일 경우 실행할 명령문.
	}		
	*/
		
		int i = 0; //시작값
		
		while (i < 10) { //조건
//			i++;
			System.out.println(i);
			i++;    			//증가 값의 위치에 따라서 결과의 차이가 존재 할 수 있음
		}
		
		//while의 무한 루프
		while (true) {
			System.out.println(i += 10000);
			if(i % 20000 == 0)
				continue;
			if(i < 0)		//반복 종료 시점..
				break; //값이 범위를 넘어서서 -(음수)가 나옴.
		}
		
		
		// do - while 구문 거의 안씀.
		//반복 할 때에 무조건 한번 이상 실행해야 하는 경우.
		i = 0;
		
		Scanner scan = new Scanner(System.in);
		
//		while((i = scan.nextInt()) != 0) {
//			System.out.println("i가 0이 아닙니다.");
//		}
		
		do {
			System.out.println(">  : ");
			i = scan.nextInt();
			System.out.println("i가 0이여도 한번은 실행");
		}while(i != 0);
		
		
		scan.close();
		
	}

}


public class D07_runtimeExceptionEx {

	
	public static void main(String[] args)throws Exception {
			//Runtime Exception =>UnchekedException 관한 내용
		//makeException(4);
		//makeException2();
		//makeException3();
		//makeException4();
		//makeException5();
		//makeException6();
		//makeExeption7();
		//makeException8();
	}
	

	public static int makeException(int input) {
		int divide = 0;
		int result = input/divide;
		return result;
	}
	public static void makeException2() {
		String s = "가";
		System.out.println(s.charAt(1));
	}
	
	public static void makeException3() throws Exception{
		int[] a = {1, 2, 3};
	System.out.println(a[3]);	
		
	}
	
	public static void makeException4() {
		String nothing = null;
		System.out.println(nothing.split(""));
	}
	
	public static void makeException5() {
		String notInt = "가나다";
		int a= Integer.parseInt(notInt);
	}
	public static void makeException6() {
		for (int i = 0; i< Integer.MAX_VALUE; i++) { //MAX_VALUE = 2의 32승
			makeException6();
		}
	}
	
	public static void makeExeption7() {
		Object[] objArr = new String[3];
		objArr[0] = 0; //선언 자체가 Object로 되어 있음으로 컴파일 오류가 발생하지 않습니다.
	}
	public static void makeException8() {
		Object[] objArr = new String[3];
		objArr[0] = "0";
		Integer a =(Integer) objArr[0];
	}

}


public class D14_wrapper {

	public static void main(String[] args) {
		//wrapper는 기본자료형을 객체로 만들기
		Object[] arrObj = new Object[10];
		
		arrObj[0] = new Byte((byte)127);
		arrObj[1] = new Short((short)32767);
		arrObj[2] = new Integer(2147483647);
		arrObj[3] = new Long(2147483647l);
		arrObj[4] = new Float(3.5f);
		//System.out.println(((Float)arrObj[4]).floatValue()); //언박싱//원래는 이런식으로 값을 빼왔었다.//신경을 쓸 필요가 별로 없다.
		arrObj[5] = new Double(3.7);
		//System.out.println(((Double)arrObj[5]).doubleValue());
		arrObj[6] = new Boolean(true);
		arrObj[7] = new Character('j');
		arrObj[8] = new String("Hello World");
		arrObj[9] = new java.util.Date();
		
		for(int i = 0; i<arrObj.length; i++) {
			System.out.println(arrObj[i]);
		}
		int a = Integer.parseInt("100"); //문자열 값을 기본 데이터 형으로 변경!
		System.out.println(a);

	}

}

import obj.modifier.Super;

public class Sub extends Super {
	
	private int num5 = 50;
	
	public void print() {
		System.out.println("Super num1 = "+num1);
		System.out.println("Super num2 = "+num2);
		//System.out.println("Super num3 = "+num3);  //default
		//System.out.println("Super num4 = "+num4);	//prinvate //클래서 내에서 접근 //직접 접근x
		System.out.println("Super num5 = "+getNim4()); //불러오기.
		System.out.println("Sub num5 = "+num5);
	}

}

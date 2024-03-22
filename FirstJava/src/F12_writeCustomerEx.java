import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import obj.Customer;

public class F12_writeCustomerEx {

	public static void main(String[] args) {
	
		Customer cus1 = new Customer("홍길동", 'M', "hong@naver.com", 1580);
		Customer cus2 = new Customer("강감찬", 'M', "kang@naver.com", 890);
		
		
		FileOutputStream fos = null; //저장
		ObjectOutputStream oos = null;
		try {									//배열 객체를 전달하기도 함.
			fos = new FileOutputStream("customer.ser");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(cus1);
			oos.writeObject(cus2);
			System.out.println("Customer 데이터가 저장되었습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(oos != null) oos.close();
			} catch (IOException e2) {}
		}
	}
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class F09_textReadApplication {

	public static void main(String[] args) {
		// 저장되어 있는 customer.txt 를 불러와 처리하기.
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("customer.txt"); //불러오기
			br = new BufferedReader(fr);
			String data = null;
			while((data = br.readLine()) != null) {
				String[] member = data.split(","); //,기준으로 문자열을 나눔
				System.out.println(Arrays.toString(member));
				int brirthYear = Integer.parseInt(member[3]);
				if(brirthYear >= 1000) {
					System.out.println(data);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(br!=null) try {br.close();} catch (Exception e2) {}
			}
		}

	}



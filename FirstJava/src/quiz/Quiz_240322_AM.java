package quiz;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

public class Quiz_240322_AM {
//[사전 작업]
//	1. 윤동주의 별을 헤는 밤을 텍스트로 만들어서 "윤동주.txt"로 저장
//	2. D:\filetest4 디렉터리를 생성한 후에 "윤동주.txt"를 저장
//
//	[작업]
//	1) 윤동주.txt 가 존재 및 파일, 디렉터리 여부를 확인
//	2) FileTest/testFile/temp 디렉터리로 파일을 이동. 없으면 만들어서 이동
//	3) 복사된 위치에서 "윤동주.txt"을 읽어서 화면에 console를 띄워 주세요!!
	public static void main(String[] args) {
		
		File file = new File("D:/filetest4/윤동주.txt");
		File dir = new File("D:/FileTest/testFile/temp");
		File dstFile = null; //복사할 파일
		
		System.out.println("윤동주.txt는 파일인가요? : "+file.isFile());
		System.out.println("dir이 존재하나요? : "+dir.exists());
		if(dir.exists()) {
			dstFile = new File(dir.getPath()+"/"+file.getName());
			file.renameTo(dstFile);
		}else {
			System.out.println("디렉토리가 존재하지 않습니다.");
			dir.mkdirs();
			System.out.println("디렉터리 생성했습니다.");
			dstFile = new File(dir.getPath()+"/"+file.getName());
			file.renameTo(dstFile);
		}
		System.out.println(dstFile);
		Reader rFile = null;
		try {
			rFile = new FileReader(dstFile);
			while(true) {
				int data = rFile.read();
				System.out.print((char)data);
				if(data == -1) break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rFile.close();
			} catch (Exception e2) {
				
			}
		}
		
	
		
		
		

	}

}

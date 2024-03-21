import java.io.File;
import java.io.IOException;

public class F01_fileEx {
	
	static String env_path = "C:\\Program Files\\Amazon Corretto\\jdk17.0.10_7\\bin;C:\\Windows\\system32;C:\\Windows;C:\\Windows\\System32\\Wbem;C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\;C:\\Windows\\System32\\OpenSSH\\;C:\\Program Files\\Git\\cmd;C:\\Program Files\\Docker\\Docker\\resources\\bin;C:\\Users\\tjoen\\AppData\\Local\\Microsoft\\WindowsApps;";
	
		public static void main(String[] args) {
		
			//File 객체는 파일과 디렉터리 작업을 위해서 사용하는 객체이다.
			
			File f = new File("D:/FileTest/a.txt"); //최 상위 경로부터 옴//절대경로
			File dir = new File("./");		//상대경로		//현재 작업위치
			
			//1. exists() : 파일 혹은 디렉터리 존재 유무 확인.
			System.out.println("exists? : "+f.exists());
			System.out.println("exists? : "+dir.exists());
			
			//2. isDirectory() : 디렉토리 여부 확인 (파일이면 false)
			System.out.println("isDirectory? : "+f.isDirectory());
			System.out.println("isDirectory? : "+dir.isDirectory());

			
			//3. isAbsolute() : 해당 경로가 절대 경로인지 아닌지 확인.
			System.out.println("isAbsolute? : "+f.isAbsolute());
			System.out.println("isAbsolute? : "+dir.isAbsolute());
			
			//4. canExecute, canRead, canWrite : 권한확인
			System.out.println("canExecute? : "+f.canExecute());
			System.out.println("canRead? : "+f.canRead());
			System.out.println("canWrite? : "+f.canWrite());
			
			//5. getAbolutePath : 절대 경로 반환 (상대경로의 절대경로를 찾아줌.)
			System.out.println("./의 실제 위치(절대경로) : "+dir.getAbsolutePath()); 
			
			//6. 부모 폴더를 문자열 반환
			System.out.println(f.getParent());		//문자열
			
			//7.부모 폴더를 File 객체로 반환
			File f_parent = f.getParentFile();		//File 객체
			System.out.println(f_parent);
			
			// 8. static 값들
			System.out.println(File.separator);
			System.out.println(File.separatorChar);
			System.out.println(File.pathSeparator);
			System.out.println(File.pathSeparatorChar);
			
			// 환경 변수
			String[] path = env_path.split(File.pathSeparator);
			
			for(String p : path) {
				System.out.println(p);
			}
			
			//파일에 대한 생성, 수정, 삭제 메서드
			File test = new File("D:\\FileTest\\temp\\abc");
			//mkdir : 해당 경로에 폴더를 생성한, 단 경로상 빠진부분이 없어야함. //경로가 없는 폴더가 없어야함. //경로가 다 있어야함.
			//mkdirs : 존재하지 않는 부모 폴더까지 모두 포함하여 폴더를 생성한다.
			if(!test.exists()) {	//파일 폴더가 존재하지 않는경우.
				test.mkdirs();
			}
			//createNewFile() : 파일이 없으면 새로 생성
			test = new File("D:/FileTest/temp/a.txt");
			try {
				test.createNewFile();
			}catch(IOException e) {
				e.printStackTrace();
			System.out.println("파일 생성 중 에러가 발생하였습니다.");	
			}
			
			//delete : 파일 혹은 폴더를 사제한다. 단, 폴더를 비어있지 않으면 삭제할 수 없다.
			test = new File("D:/FileTest/temp/abc");
			test.delete();
//			test = new File("D:/FileTest/temp/a.txt");
//			test.delete();
//			test = new File("D:/FileTest/temp");
//			test.delete();
		
			//renameTo : 파일이나 폴더의 이름 및 경로를 변경합니다.
			test = new File("D:/FileTest/temp");
			File dst = new File("D:/FileTest/temp22");
			test.renameTo(dst);
		}
		
		
		
}

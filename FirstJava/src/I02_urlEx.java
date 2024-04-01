import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;

public class I02_urlEx {
	/*
	 * URL 객체를 생성
	 * 	-URL url = new("전체주소");
	 * 	-URL url = new("호스트명","경로 /파일명");
	 * 	-URL url = new("호스트명",포트번호,"경호/파일명");
	 * 
	 * 
	*/
	public static void main(String[] args) {
		try {
			URL url = null;
			url = new URL("https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&ssc=tab.nx.all&query=url");
			System.out.println("authority : "+url.getAuthority());
			System.out.println("content : "+url.getContent());
			System.out.println("protocol : "+url.getProtocol());
			System.out.println("host : "+url.getHost());
			System.out.println("port : "+url.getPort());
			System.out.println("path : "+url.getPath()); 
			System.out.println("file : "+url.getFile());
			System.out.println("query : "+url.getQuery());
			
			//url을 통해서 정보읽기.
			int data = 0;
			try {
				Reader is = new InputStreamReader(url.openStream());
				while((data = is.read()) != -1) {
					System.out.print((char)data);
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} 
			System.out.println();
			// URLConnection
			// 추상 클래스로 URL간의 연결을 담당하는 역할을 한다.
			//URLConnection을 상속받아 구현한 클래스 HttpURLConnection, JarURLConnection
			url = null;
			String address = "https://www.egovframe.go.kr/home/sub.do?menuNo=9";
			
			try {
				url = new URL(address);
				URLConnection conn = url.openConnection();  //openConnection - URLConnection 객체 반환
				System.out.println("conn.toString() : "+conn);
				System.out.println("getAllowUserInteraction() : "+conn.getAllowUserInteraction());
				System.out.println("getConnectTimeout() : "+conn.getConnectTimeout());
				System.out.println("getContent() : "+conn.getContent());
				System.out.println("getContentEncoding() : "+conn.getContentEncoding());
				System.out.println("getContentLength() : "+conn.getContentLength());
				System.out.println("getContentType() : "+conn.getContentType());
				System.out.println("getDate() : "+conn.getDate());
				System.out.println("getDefaultAllowUserInteraction() : "+conn.getDefaultAllowUserInteraction());
				System.out.println("getDefaultUserCaches() : "+conn.getDefaultUseCaches());
				System.out.println("getDoInput() : "+conn.getDoInput());
				System.out.println("getDoOutput() : "+conn.getDoOutput());
				System.out.println("getExpiration() : "+conn.getExpiration());
				System.out.println("getHeaderFields() : "+conn.getHeaderFields());
				System.out.println("getIfModifiedSince() : "+conn.getIfModifiedSince());
				System.out.println("getLastModified() : "+conn.getLastModified());
				System.out.println("getReadTimeout() : "+conn.getReadTimeout());
				System.out.println("getURL() : "+conn.getURL());
				System.out.println("getUseCaches() : "+conn.getUseCaches());
				
				BufferedReader br = null;
				String readline = "";
				
				try {
					url = new URL(address);
					br = new BufferedReader(new InputStreamReader(url.openStream()));
					
					while((readline = br.readLine()) != null) {
						System.out.println(readline);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					try {if(br != null) br.close();} catch (Exception e2) {
					}
				}
				
				
			}catch (Exception e) {
				// TODO: handle exception
			}
		
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

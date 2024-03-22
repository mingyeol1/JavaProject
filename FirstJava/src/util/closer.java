package util;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class closer {
	
	//생성자.
	private closer() {}
	
	public static void closer(Writer w) {
		try {
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void closer(Reader r) {
		try {
			r.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

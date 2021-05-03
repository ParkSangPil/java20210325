package p18.lecture;
//가나다라마바사  <- this is KOREAN yuyu

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class A17FilterStream {
	public static void main(String[] args) throws Exception{
		// inputstream -> reader
		String file = "src/p18/lecture/A17FilterStream.java";
		InputStream is = getInputStream(file);
		InputStreamReader isr = new InputStreamReader(is); // 다른 Stream으로부터 읽는 스트림 (InputStreamReader)
		
		int b = 0;
		
		while((b = isr.read()) != -1) {
			System.out.print((char) b);
		}
		
		isr.close();
		is.close();
	}
	
	public static InputStream getInputStream(String file) throws Exception{
		return new FileInputStream(file);
	}
}

package p18.lecture;

import java.io.FileInputStream;
import java.io.InputStream;

public class A02InputStream {
	public static void main(String[] args) throws Exception{
		String fileName = "src/p18/lecture/A02InputStream.java";
		InputStream is = new FileInputStream(fileName); // 통로가 마련이 됨
		
//		int b1 = is.read();
//		int b2 = is.read();
//		int b3 = is.read();
//		
//		System.out.println(b1);
//		System.out.println(b2);
//		System.out.println(b3);
		
		int b = 0;
		int count = 0;
		while((b = is.read()) != -1) { // 읽을게 없으면 -1을 return 하니까
			System.out.println(b);
			count++;
		}
		System.out.println("이게 실행된 횟수 "+count);
		
		is.close();
	}
}

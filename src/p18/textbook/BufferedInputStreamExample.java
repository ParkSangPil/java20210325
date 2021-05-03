package p18.textbook;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception {
		String file = "src/p18/textbook/BufferedInputStreamExample.java";
		long start = 0;
		long end = 0;

		FileInputStream fis1 = new FileInputStream(file);

		start = System.nanoTime();
		while ((fis1.read()) != -1) {

		}
		end = System.nanoTime();
		System.out.println(end - start);
		fis1.close();

		FileInputStream fis2 = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis2);

		start = System.nanoTime();
		while ((bis.read()) != -1) {

		}
		end = System.nanoTime();
		System.out.println(end - start);
		
		fis2.close();
		bis.close();
	}
}

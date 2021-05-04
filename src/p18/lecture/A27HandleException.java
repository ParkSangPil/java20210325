package p18.lecture;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class A27HandleException {
	public static void main(String[] args) {
		String path = "src/p18/lecture/A27HandleException.java";

		// try with resources 자동으로 닫힌다. close()
		try (
				FileInputStream fis = new FileInputStream(path);
				FileOutputStream fos = new FileOutputStream(path);
				BufferedInputStream bis = new BufferedInputStream(fis);) 
		{

			fis.read();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
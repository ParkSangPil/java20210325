package p10.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class A14TryWithResources {
	public static void main(String[] args) {
		String path = "src/p10/lecture/A13TryWithResources.java";
		try (FileInputStream fis = new FileInputStream(path);) {
			// ...... try() 괄호 안에 있으면 fis를 자동으로 닫아준다.
			// 자동으로 닫아주는 변수의 타입은 항상 AutoCloseable 이여야 한다

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}
	}
}

package p18.textbook.exercise.ex07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {

		String filePath = "src/p18/textbook/exercise/ex07/AddLineNumberExample.java";
		Reader reader = new FileReader(filePath);
		BufferedReader br = new BufferedReader(reader);

		String a = null;
		int count = 0;
		while ((a = br.readLine()) != null) {
			count++;
			System.out.println(count+": "+a);
		}
		
		reader.close();
		br.close();
	}
}

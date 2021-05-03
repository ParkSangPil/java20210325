package p18.lecture;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class A18FilterStream {
	public static void main(String[] args) throws Exception{
		String file = "src/p18/lecture/output7.txt";
		OutputStream os = getOutputStream(file);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		
		os.write('a');
		os.write('b');
		os.write('가');
		os.write('c');
		
		osw.write('가');
		
		osw.close();
		os.close();
	}
	
	public static OutputStream getOutputStream(String file) throws Exception{
		
		
		return new FileOutputStream(file);
	}
}

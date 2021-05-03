package p18.lecture;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class A14ToTextFile {
	public static void main(String[] args) throws Exception{
		String file = "src/p18/lecture/output4.txt";
		Scanner scanner = new Scanner(System.in);
		Writer wt = new FileWriter(file);
		
		String line = "";
		
		while(!line.equals("종료")) {
			System.out.print("입력>");
			line = scanner.nextLine();
			// line 이 저장한 문자열을 output4.txt에 쓰기
			// write할 때 끝에 enter 입력 해야함 (엔터 = \n)
			if(line.equals("종료")) {
				break;
			}
			wt.write(line+"\n");
		}
		
		scanner.close();
		wt.close();
	}
}

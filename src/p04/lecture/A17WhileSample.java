package p04.lecture;

import java.util.Scanner;

public class A17WhileSample {
	public static void main(String[] args) {
		int comNumber = (int) (Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("컴퓨터의 수를 맞춰보세요>");
		
		while (true) {
			int number1 = scanner.nextInt();

			if (number1 < comNumber) {
				System.out.print("아닙니다 더 \"높은\" 수를 입력해 보세요.");
			} else if (number1 > comNumber) {
				System.out.print("아닙니다 더 \"낮은\" 수를 입력해 보세요.");
			} else if (number1 == comNumber) {
				System.out.println("축하합니다! 정답입니다.");
				break;
			}
		}
		scanner.close();
		System.out.println("프로그램 종료");
	}
}

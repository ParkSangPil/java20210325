package p04.textbook;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		int i = 0;
		// 1~10 홀수만
		for (i = 1; i <= 10; i++) {
			System.out.println(i);
			i++;
		}
		System.out.println("--------------------------------");
		// 1~10 짝수만
		for (i = 2; i <= 10; i++) {
			System.out.println(i);
			i++;
		}
		System.out.println("--------------------------------");
		// 1~10
		for (i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("--------------------------------");
		// 10~1 짝수만
		for (i = 10; i >= 1; i--) {
			System.out.println(i);
			i--;
		}
		System.out.println("--------------------------------");
		// 10~1 홀수만
		for (i = 9; i >= 1; i--) {
			System.out.println(i);
			i--;
		}
	}
}

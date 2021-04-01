package p04.textbook;

import java.util.Scanner;

public class Ch0407test {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int account = 10000;
		int withdrow = 0;
		int balance = 0;

		Scanner scanner = new Scanner(System.in);
		while (run) {
			if (balance != 13 && balance != 10) {
				System.out.println("---------------------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("---------------------------------");
				System.out.print("선택> ");
			}

			balance = System.in.read();

			if (balance == 49) {
				withdrow = 0;
				System.out.print("입금액>");
				withdrow = scanner.nextInt();
				account += withdrow;
				
				System.out.println("예금액>" + account);
			} else if (balance == 50) {
				
				withdrow = 0;
				System.out.print("출금액>");
				withdrow = scanner.nextInt();
				account -= withdrow;
				continue;
				
			} else if (balance == 51) {
				System.out.println("잔고>" + account);
			} else if (balance == 52) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}

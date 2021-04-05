package p05.textbook.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {

		int max = 0;
		int sum = 0;
		int topnum = 0;
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int stunum = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.print("학생 수를 입력해 주세요.");
				stunum = scanner.nextInt();
				scores = new int[stunum];
				continue;
			} else if (selectNo == 2) {
				System.out.println("학생 수는 " + stunum + "명 입니다.");
				System.out.println("학생 수만큼 입력해 주세요");
				int k = 0;
				while (k != stunum) {
					for (int j = 0; j < stunum; j++) {
						System.out.println((j + 1) + "번 학생 점수");
						scores[k] = scanner.nextInt();
						k++;
					}
					System.out.println("다 입력했습니다.");
					break;
				}
			} else if (selectNo == 3) {
				System.out.println("점수 리스트 입니다.");
				for (int t = 0; t < scores.length; t++) {
					System.out.println((t + 1) + "번째 학생 점수 : " + scores[t]);
				}
				System.out.println(Arrays.toString(scores));
				System.out.println(scores.length);
			} else if (selectNo == 4) {
				max = scores[0];
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i]) {
						max = scores[i];
						topnum = i + 1;
					}
				}
				sum = 0;
				for (int x = 0; x < scores.length; x++) {
					sum += scores[x];
				}
				System.out.println("최고 점수자는 " + topnum + "번 " + max + "점입니다.");
				System.out.println("반 평균은 " + (double) (sum / scores.length) + "점입니다.");

			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}

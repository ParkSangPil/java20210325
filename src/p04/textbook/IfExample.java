package p04.textbook;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");

			if (score < 90) {  //{없으면 if아래만 작동한다
				System.out.println("점수가 90보다 작습니다.");
				System.out.println("등급은 B입니다.");
			}
		}
	}
}
package p13.textbook.s130501;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		// String str = Utill.copare("a","b"); Number 라 String 타입이 못들어옴

		int result1 = Utill.compare(10, 20); // 왼쪽이 크면 1 오른쪽이 크면 -1 같으면 0인듯
		System.out.println(result1);

		int result2 = Utill.compare(4.5, 3);
		System.out.println(result2);
	}
}

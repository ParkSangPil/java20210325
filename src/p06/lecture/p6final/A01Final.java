package p06.lecture.p6final;

public class A01Final {
	final static int f = 55;

	static {
//		f = 55;
	}
	
	final static double PI = 3.1415;  //이럴 때 쓴당 관습은 모두 대문자로

	int a;
	final int b = 9;

	A01Final() {
//		this.b = 9;        저 위처럼 만들때 초기화 하던 아님 지금처럼 하든
	}

	public static void main(String[] args) {
		// final 변수(지역변수, 파라미터, 필드)
		// 값을 한번만 할당 받을 수 있음

		final int i;
		int j;
		j = 3;
		j = 5;

		i = 9;
//		i = 10; 두번째 부터는 안돼용
	}

	static void method1(final int i) {
		System.out.println(i);
//		i = 3;
	}
}

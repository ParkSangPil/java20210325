package p10.lecture;

public class A18ThrowKeyword {
	public static void main(String[] args) {
		method1();
	}

	private static void method1() {
		int i = 0;

		if (i == 0) {
			throw new RuntimeException("iê° 0ìëë¤.");
		}
	}

	private static void method2() throws Exception {
		int i = 0;

		if (i == 0) {
			throw new Exception();
		}
	}
}

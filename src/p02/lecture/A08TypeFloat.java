package p02.lecture;

public class A08TypeFloat {
	public static void main(String[] args) {
		// float : 4byte (32bit) 실수를 저장할 수 있다.

		long longVar = 2200000000L;

		float var;
		var = 3.1415925233F; // 실수 literal은 double 타입
		// 양수 최대값은
		System.out.println(Float.MAX_VALUE);
		// 양수 최소값은
		System.out.println(Float.MIN_VALUE);

		// 음수 최소값
		System.out.println(-Float.MAX_VALUE);

		// 음수 최댓값
		System.out.println(-Float.MIN_VALUE);

		// 양의 무한대
		System.out.println(Float.POSITIVE_INFINITY);

		// 음의 무한대
		System.out.println(Float.NEGATIVE_INFINITY);

		// NaN (Not a Number)
		System.out.println(Float.NaN);
		
		System.out.println(var);
	}
}

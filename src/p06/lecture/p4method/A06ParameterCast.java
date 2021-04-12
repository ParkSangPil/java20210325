package p06.lecture.p4method;

public class A06ParameterCast {
	public static void main(String[] args) {
		int a = 5;
		double b;
		b = a;
		// 작은 타입 int는 큰타입double로 자동으로 변환된다

		MyClass6 o1 = new MyClass6();
		o1.method1(a);
//		o1.method1(b);         이건 안됨 ㅋㅋㅋ
		
		o1.method2(a);
		o1.method2(b);
	}
}

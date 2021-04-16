package p09.lecture;

public class A06AnonymouesClass {
	public static void main(String[] args) {
		int localVar = 3;
		// 파이널이라 값은 못바꿔요!
		
		MyInterface i1 = new MyInterface() {
			void method() {
				System.out.println(localVar);
				System.out.println(args);
			}
		};
	}
}

package p09.lecture;

public class A04LocalClassAccess {
	void method(/*final 인 것이다*/int param) {
		/*final 인 것이다*/ int localVar = 3;
//		localVar = 4;
		
		class LocalClass{
			void method1() {
				System.out.println(localVar);
				System.out.println(param);
			}
		}
	}
}

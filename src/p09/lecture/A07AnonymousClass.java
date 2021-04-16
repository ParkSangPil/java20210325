package p09.lecture;

public class A07AnonymousClass {
	MyInterface o1 = new MyInterface() {
		
	};
	
	void method2() {
		// 매개값(argument)
		method1(new MyInterface(){
			
		});
	}
	
	void method1(MyInterface o) {
		
	}
}

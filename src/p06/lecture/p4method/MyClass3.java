package p06.lecture.p4method;

public class MyClass3 {
	int a;
	void method1() {
//		int a;
		System.out.println("a:"+a/* == this.a*/);
		System.out.println("method1 호출");
		
		/*this. 를 써도 됨*/method2();
		
		System.out.println("method1 진행....");
	}
	
	void method2() {
		System.out.println("method2 호출");
	}
}

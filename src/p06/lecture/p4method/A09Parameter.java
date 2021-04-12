package p06.lecture.p4method;

public class A09Parameter {
public static void main(String[] args) {
	// 메소드명이 같아도 파라미터의 타입, 순서, 개수가 다르면
	// 다른 메소드임 이걸 method overloading 이라고 함
	MyClass9 o1 = new MyClass9();
	
	o1.method();
	o1.method(0);
	o1.method(3.14);
	o1.method(1,2);
	o1.method(1,"hello");
	o1.method("hello",2);
}
}

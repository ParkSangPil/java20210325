package p06.lecture.p8access_modifier;

import p06.lecture.p8access_modifier.package1.MyClass1;

public class A02AccessModifierExample {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
		
//		System.out.println(o1.j); j 는 private 라 접근 못함 ㅠㅠ
		System.out.println(o1.i);
//		System.out.println(o1.k); k 는 default, package private 라 못함 ㅠ
	}
}

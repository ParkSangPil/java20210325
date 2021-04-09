package p06.lecture.p7package;

import java.util.Scanner;

import p06.lecture.p7package.package2.MyClass2;
//import p06.lecture.p7package.package2.*; 여러개의 클래스를  import하고 싶을 때

public class A02Package {
	public static void main(String[] args) {
		p06.lecture.p7package.package1.MyClass1 o1 = 
				new p06.lecture.p7package.package1.MyClass1();
		
		// MyClass1 은 다른 패키지에 있기 때문에 
		
		MyClass2 o2 = new MyClass2();
		
		// 3번째 줄에 import 로 추가해 줘서 사용 가능
		
		MyClass3 o3 = new MyClass3();
		
		// 같은 패키지에 있어서 간단함
		
		Scanner scanner - new Scanner(System.in)
	}
}

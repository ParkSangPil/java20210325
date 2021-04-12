package p06.lecture.p4method;

import java.util.Arrays;

public class A05Parameter {
	public static void main(String[] args) {
		MyClass5 o1 = new MyClass5();
		o1.method1();
		
		// argument 인수, 인자
		o1.method2(2);
		o1.method2(5);
		
		int a=5,b=7;
		o1.method3(a,b);
		
		int[] arr1 = {1,2,3};
		o1.method4(arr1);
		System.out.println(arr1[0]);
		System.out.println(Arrays.toString(arr1));
		
		o1.method4(new int[] {9,8});
		System.out.println(Arrays.toString(arr1));
	}
}

package p02.lecture;

public class A13TypeConverstion {
	public static void main(String[] args) {
		// int : 4byte (32bit)
		// float : 4byte (32bit)
		
		// float 저장법
		// 부호비트 1
		// 지수비트 8                   + A x 2^n
		// 가수비트 23
		// 0000 0000 0000 0000 0000 0000 0000 0000
//		              ---------------------------- 까지 A
//		    ----------  까지 지수
//		   -   까지 부호
		
		int intVar1 = 66977791;
		float floatVar1 = intVar1;
		
		System.out.println(floatVar1);
		
		// double 저장법 (8byte)
		// 부호비트 1
		// 지수비트 11
		// 가수비트 52
		
		double doubleVar1 = intVar1;
		System.out.println(doubleVar1);
		
	}
}

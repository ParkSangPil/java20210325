package p02.lecture;

public class A11TypeConversion {
	public static void main(String[] args) {
		// 정수 : byte, short, int, long
		
		
		//자동 형변환 
		byte byteVar1 = 100;
		short shortVar1 = byteVar1;
		int intVar1 = shortVar1;
		intVar1 = byteVar1;
		
		long longVar1 = intVar1;
		longVar1 = shortVar1;
		longVar1 = byteVar1;
		///////////////////////
		int intVar2 = 1000000000;
		short shortVar2 = 100;
//		shortVar2 = intVar2;   // 안됨 ㅋㅋ
		shortVar2 = (short) intVar2;
		
		System.out.println(shortVar2);
	}
}

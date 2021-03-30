package p03.lecture.p2binary.p4bit;

public class A01Bit {
	public static void main(String[] args) {
		// and &
		// or |
		// xor ^
		// not ~

		// and &
		int a = 99; // 000.....     0110 0011
		int b = 999; // 0000...  11 1110 0111
		
		// a & b;   2진법 :      00 0110 0011
		int c = a & b;
		System.out.println(c);
		
		// or |
		c = a | b; // 2진법 :    11 1110 0111
		System.out.println(c);
		
		// xor ^
		c = a ^ b; // 2진법 :    11 1000 0100
		System.out.println(c);
	}
}

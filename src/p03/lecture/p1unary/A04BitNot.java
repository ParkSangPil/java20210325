package p03.lecture.p1unary;

public class A04BitNot {
	public static void main(String[] args) {
		//비트반전 : ~
		//0은 1로 바꿔주고  1은 0으로 바꿔준다
		
		int a = 99; // 0000 ...... 0000 0110 0011
		int b = ~a; 
		System.out.println(a);
		System.out.println(b);  // -100  == 1111 ......... 1111 1001 1100
	}
}

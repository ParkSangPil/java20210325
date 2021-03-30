package p03.lecture.p2binary.p4bit;

public class A03BitShiftRight {
public static void main(String[] args) {
	// >> : 왼쪽을 부호비트 채움
	// >>> : 왼쪽을 0으로 채운다
	
	// 1111 111.........  1001 1101
	int a = -99;
	
	// a >> 1;     산수 shift
	// 생김 -> 11111111111111111......1001 110/1 <- 날아감
	System.out.println(a >> 1);
	
	// a >>> 1      논리 shift
	// 생기는데 0으로 생김 -> 011111...   1001 110/1 <- 날아감
	System.out.println(a >>> 1);
}
}

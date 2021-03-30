package p03.lecture.p2binary.p4bit;

public class A02BitShift {
public static void main(String[] args) {
	// left shift << : 왼쪽으로 비트 이동
	//                 (오른쪽은 0으로 채움)
	// right shift >> : 오른쪽으로 비트 이동
	//                  (왼쪽비트는 부호비트로 채움)
	
	// right shift >>> : 오른쪽으로 비트 이동
	//                   (왼쪽비트는 0으로 채움)
	
	// left shift <<
	int a = 99;   // 0110 0011
	// a << 1     // 1100 0110  <-빈 곳은 0으로 채움
	int b = a<<1;
	System.out.println(b);  // <  *2같은거네 ㅋㅋㅋㅋ
	
	b = a << 2;   // 01 1000 1100
	System.out.println(b);
	
	// right shift >>         그럼 이건 /2네?
	// a      //  0110 0011
	// a >>   //  0011 0001
	b = a >> 1;  
	System.out.println(b);
	System.out.println(a >>2);
	
}
}

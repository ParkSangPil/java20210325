package p02.lecture;

public class A03TypeByte {
	public static void main(String[] args) {
//byte : 1byte 크기의 정수를 저장할 수 있음.
//1byte == 8 bit
//0000 0000 ~ 1111 1111
		
//		십진법 0 == 0000 0000
//		십진법 1 == 0000 0001
//		십진법 2 == 0000 0010
//		         :
//		십진법 127 == 0111 1111
//		십진법 -128 == 1000 0000 //맨 왼쪽 비트가 1이면 음수로 판단
//		십진법 -127 == 1000 0001 
//		         :
//		십진법 -1 == 1111 1111
//		십진법 0 == 10000 0000 인데 8개밖에 못쓰니까 1이 사라짐 결국  0000 0000이 됨
//		최소값은 : -128
//		최대값은 : 127
		        	 
		byte byteVar;
		byteVar = -128;
		byteVar = 127;
		
//		byteVar = -129; //not ok
//		byteVar = 128; //not ok
	}
}

package p02.lecture;

public class A05TypeInt {
public static void main(String[] args) {
//	int : 4byte(32bit)
//	십진법 0 = 0000 0000 0000 0000 0000 0000 0000 0000
//	십진법 1 = 0000 0000 0000 0000 0000 0000 0000 0001
//	         :
//	2,147,483,647 : 0111 1111 1111 1111 1111 1111 1111 1111
//	+ 1      : 1000 0000 0000 0000 0000 0000 0000 0000 == -2,147,483,648
//	    -1   : 1111 1111 1111 1111 1111 1111 1111 1111
	
	int intVar; 
	intVar = 0;
	intVar = 2147483647;
//	intVar = 2147483648; //not ok
	intVar = -2147483648;
//	intVar = -2147483649; //not ok
	
//	16진법 : 0 ~ F
//	2진법 : 0000 ~ 1111
//	10진법 : 0 ~ 15
	
	intVar = 255;
	System.out.println(intVar);
	intVar = 0xFF;
	System.out.println(intVar);
	intVar = 0377;
	System.out.println(intVar);
}
}

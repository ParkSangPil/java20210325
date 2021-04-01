package p04.lecture;

public class A19DoWhile {
public static void main(String[] args) {
	boolean a = false;
	while(a) {
		System.out.println("while code block");
	}
	
	// do while(); : 코드 블럭이 최초 한번은 실행됨
	//               그러니까 조건 무시하고 처음은 실행됨
	do {
		System.out.println("do while code block");
	} while (a);
	System.out.println("프로그램 종료...");
}
}

package p02.lecture;

public class A01 {
	public static void main(String[] args) {
		// 변수 : 값을 저장하는 이름있는 공간의 이름
		// 변수 선언 방법 :
		// type명(int) 변수명 (a);
		int a = 0;

		// 변수명을 작성 규칙은:
		// $,_,영문 대소문자,숫자 조합
		// BUT숫자가 제일 처음이면 안됨.
		// 작성 관습 : lowerCamelCase

		// type들 : 기본타입(8개), 참조타입(챕터5)
		// 기본타입 : byte, short, int, long, boolean, char, float, double

		// 값 할당 =, +=, -=, /=, %= : 할당 연산자 사용해도 됨
		a = 5;
		System.out.println(a);
		
		a=7;
		
		System.out.println(a);
		
	}
}

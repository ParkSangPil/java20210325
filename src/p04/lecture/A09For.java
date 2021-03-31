package p04.lecture;

public class A09For {
	public static void main(String[] args) {
		System.out.println("실행문 1");
		
		// 실행 순서
		// four(  1   ;   2   ;   3   )
		// 1이 실행되고 2가 실행할 때 true 면 코드 블록을 시행하고 3번을 거져서 2번으로 반복 false를 만나면 종료
		for(int i = 0;i < 10;i++){
			System.out.println("실행문 "+i);
		}
		
		System.out.println("실행문 1");
	}
}

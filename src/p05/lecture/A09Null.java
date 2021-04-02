package p05.lecture;

public class A09Null {
	public static void main(String[] args) {
		String s = "java";
		String t = "java";

		t = null; // 참조하는 객체(instance)가 없음 즉 주소 없앰
		s = null; // 참조되고 있지 않은 객채를 모아서 없애주는 게 jvm의 gabage callector 이다 그러니까
					// 알아서 없애준다는 뜻
	}
}

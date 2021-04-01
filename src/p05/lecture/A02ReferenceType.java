package p05.lecture;

public class A02ReferenceType {
	public static void main(String[] args) {
		int i;
		i = 3;
		
		String s;
		s = new String("java"); // new String에 의해서 객채가 생성되고
		// s가 참조 값을 가지게 되는 거니까
		// 나중에 s 를 찾으면 객채라고 할 수 있는데 진짜로는 참조변수이다.
		
		//String : 타입
		//s : (참조)변수
		//new String("java") : 객체(instance(개체), object(객체))
		//s 가 가진 값 : 참조값
	}
}

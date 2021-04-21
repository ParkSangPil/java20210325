package p06.lecture.paAnnotation;

public class A01Annotation {
	// annotation : 메타 데이터 (부가 정보)
	// 컴파일러 하면 다른 프로그램에게 정보를 줌

	// 주석 : 프로그램에 영향을 안끼치고 사람에게 알려주는거

	// EX : Override

	@Override
	public String toString() {
		return super.toString();
	}

	@MyAnnotation1
	public void method1() {
		
	}
}

package p06.lecture.paAnnotation;

@MyAnnotation3
public class A04Annotation {
	@MyAnnotation3(999) // 값을 하나만 줄때는 요롷게 가능
	public void method1() {
		
		@MyAnnotation3
		int val;
	}
	//   위아래는 같은거다
	@MyAnnotation3(value = 999)
	public void method2() {
		
	}
	
	@MyAnnotation3(value = 999, attr1 = 765)
	public void method3() {
		
	}
}

package p06.lecture.paAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@ForType
public class A05Annotation {
	
//	@ForType   //붙는게 불가 ㅠㅠ
//	int field;
	
	@ForField
	@ForFieldAndMethod
	int field; // 얜 두개의 annotation 을 가진거임 ㅋㅋ
	
	@ForFieldAndMethod
	public void method1() {
		
	}
}

@Target(ElementType.TYPE)
public @interface ForType {}

@Target(ElementType.FIELD)
@interface ForField{}

@Target({ElementType.FIELD,ElementType.METHOD})
@interface ForFieldAndMethod{}
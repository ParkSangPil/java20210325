package p07.lecture.p4access_modifier_protected.pakage2;

import p07.lecture.p4access_modifier_protected.pakage1.Parent;

public class Child extends Parent{

	
	public void childMethod() {
		publicMethod();
		protectedMethod();
		
//		defaultMethod();
//		privateMethod();
	}
}

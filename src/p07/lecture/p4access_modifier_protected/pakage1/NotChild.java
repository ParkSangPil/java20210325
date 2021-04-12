package p07.lecture.p4access_modifier_protected.pakage1;

public class NotChild {

	public void NotChildMethod() {
		Parent p = new Parent();
		p.publicMethod();
		p.protectedMethod();
		p.defaultMethod();
//		p.privateMethod(); ㅋㅋㅋ 앙댐
	}
}

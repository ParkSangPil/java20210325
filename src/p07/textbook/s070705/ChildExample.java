package p07.textbook.s070705;

public class ChildExample {
public static void main(String[] args) {
	Parent parent = new Child();
	parent.field1 = "data1";
	parent.method1();
	parent.method2();
	
//	parent.fueld2 = "data2";
//	parent.method3();
	
	Child child = (Child) parent; // 강제 형변환 ㄷㄷ
	child.field2 = "yyy";
	child.method3();
}
}

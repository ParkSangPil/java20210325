package p11.lecture.classClass;

public class A03Class {
	public static void main(String[] args) {
		Class c1 = A03Class.class;
		Class c2 = A03Class.class;
		
		System.out.println(c1.isInterface());
		System.out.println(c2.isInterface());
	}
}

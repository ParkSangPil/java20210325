package p08.lecture.ex1;

public class A01Interface {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		Malamute d1 = new Malamute();
		
		KindaCat k1 = c1;
		Pet p1 = c1;
		
		KindaDog k2 = d1;
		Pet p2 = d1;
		p2.sit();
		
		c1.sit();
		d1.sit();
		
//		Pet p3 = new Pet();   이렇게 못해용 인터페이스는
	}
}

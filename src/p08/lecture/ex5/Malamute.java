package p08.lecture.ex5;

public class Malamute extends KindaDog implements Pet, SledDog {
	@Override
	public void bark() {
		System.out.println("왈왈~~~!");
	}

	@Override
	public void sit() {
		System.out.println("앉아!!");
	}

	@Override
	public void pull() {
		System.out.println("끌어!!");
	}
}

package p08.lecture.ex5;

public class A02Instanceof {
	public static void main(String[] args) {
		KindaDog d1 = new Malamute();
		
		System.out.println(d1 instanceof KindaDog);
		System.out.println(d1 instanceof Malamute);
		System.out.println(d1 instanceof Pet);
		System.out.println(d1 instanceof SledDog);
		System.out.println(d1 instanceof Wolf);
		
		Malamute m1 = (Malamute) d1;
		Pet p1 = (Pet) d1;
		SledDog s1 = (SledDog) d1;
//		Wolf w1 = (Wolf) d1;         이것 뿐만 아니라 모두 위험한 코드임
		
		System.out.println("끼잉낑");
	}
}

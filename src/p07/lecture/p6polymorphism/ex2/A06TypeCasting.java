package p07.lecture.p6polymorphism.ex2;

public class A06TypeCasting {
	public static void main(String[] args) {
		Tiger tiger1 = new Tiger();
		tiger1.cry();
		tiger1.hunt();
		
		System.out.println("자동형변환");
		
		KindaCat k1 = tiger1;
		
		k1.cry();
//		k1.hunt(); 앙댐
		
		System.out.println("강제형변환 (CASTING)");
		Tiger tiger2 = (Tiger) k1;
		tiger2.cry();
		tiger2.hunt();
	}
}

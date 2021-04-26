package p13.textbook.s130401;

import p13.textbook.s130202.Box;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = Util.boxing/*<String>*/("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);
	}
}

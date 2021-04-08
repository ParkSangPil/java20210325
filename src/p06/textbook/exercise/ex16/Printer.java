package p06.textbook.exercise.ex16;

public class Printer {
	int println(int i) {
		System.out.println(i);
		return i;
	}

	boolean println(boolean i) {
		System.out.println(i);
		return i;
	}

	int println(int i,int j) {
		System.out.println(i+", "+j);
		return i+j;
	}

	String println(String i) {
		System.out.println(i);
		return i;
	}
}

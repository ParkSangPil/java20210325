package p06.textbook.exercise.ex17;

public class Printer {
	static int println(int i) {
		System.out.println(i);
		return i;
	}

	static boolean println(boolean i) {
		System.out.println(i);
		return i;
	}

	static int println(int i,int j) {
		System.out.println(i+", "+j);
		return i+j;
	}

	static String println(String i) {
		System.out.println(i);
		return i;
	}
}

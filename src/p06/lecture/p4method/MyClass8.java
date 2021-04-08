package p06.lecture.p4method;

public class MyClass8 {
	int max() {
		return 0;
	}

	int max(int... values) {
		int max = 0;
		for (int j = 0; j < values.length; j++) {
			if (values[j] > max) {
				max = values[j];
			}
		}
		return max;
	}
}
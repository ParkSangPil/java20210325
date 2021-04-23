package p12.lecture;

public class A11ThreadPriority {
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			Thread t = new Thread(new Thread11());
			if (i == 0) {
				t.setPriority(1); // 우선순위 ㅋㅋ
			} else {
				t.setPriority(10);
			}
			t.start();
		}
	}
}

class Thread11 implements Runnable {
	@Override
	public void run() {
		for (long i = 0; i < 1000000000; i++) {

		}
		System.out.println(Thread.currentThread().getName());
	}
}
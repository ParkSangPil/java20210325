package p12.lecture;

import java.awt.Toolkit;

public class A04Thread {
	public static void main(String[] args) {
		Thread t1 = new Thread4();

		t1.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띠링~~");
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class Thread4 extends Thread {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // 컴퓨터에서 소리가 나도록 하는 거임
			System.out.println("띠로링~!");
			try {
				Thread.sleep(1000);				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
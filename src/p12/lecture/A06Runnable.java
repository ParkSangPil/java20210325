package p12.lecture;

import java.awt.Toolkit;

public class A06Runnable {
	public static void main(String[] args) {
		Thread t6 = new Thread(new Thread6());
		t6.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띠리링~~~~");
			try {				
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class Thread6 implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread6 실행");
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		
		for(int i = 0 ; i < 5 ; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
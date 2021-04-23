package p12.lecture;

public class A14SynchronizedMethod {
	public static void main(String[] args) {
		Thread14 t1 = new Thread14();
		Thread14 t2 = new Thread14();
		
		Box box = new Box();
		t1.box = box;
		t2.box = box;
		
		t1.start();
		t2.start();
	}
}

class Thread14 extends Thread {
	public Box box;

	@Override
	public void run() {
		box.execute();
	}
}

class Box {
	public synchronized void execute() { // synchro 는 한번 끝나야 이 execute를 불로올 수 있다
		//                                  그러니까 다 쓰고 돌려줘야 다시 사용 가능
		System.out.println("method start");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("method end");
	}
}
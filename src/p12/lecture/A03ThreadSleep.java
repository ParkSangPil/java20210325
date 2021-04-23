package p12.lecture;

public class A03ThreadSleep {
	public static void main(String[] args) {

		
		System.out.println("실행 1");
		
		try {
			Thread.sleep(10000);			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("실행 2");
	}
}

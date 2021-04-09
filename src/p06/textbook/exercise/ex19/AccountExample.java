package p06.textbook.exercise.ex19;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고 :"+account.getbalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고 :"+account.getbalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고 :"+account.getbalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고 :"+account.getbalance());
		
		account.setBalance(-70000);
		System.out.println("현재 잔고 :"+account.getbalance());
	}
}

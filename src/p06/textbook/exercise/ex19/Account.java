package p06.textbook.exercise.ex19;

public class Account {
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	
	private int account;

	public int getbalance() {
		return account;
	}

	public void setBalance(int account) {
		if (account>MIN_BALANCE && account<=MAX_BALANCE) {
		this.account += account;
		}
	}
}

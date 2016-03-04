
public class TimeAccount extends Account {
	private long timeBalance;
	
	public TimeAccount(String name, String no, long balance, long timeBalance) {
		super(name, no, balance);
		this.timeBalance = timeBalance;
	}
	
	long getTimeBalance() {
		return timeBalance;
	}
	
	void cancel() {
		deposit(timeBalance);
		timeBalance = 0;
	}
}

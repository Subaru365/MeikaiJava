class Account {
	private static int counter = 0;

	private String name;
	private String no;
	private long balance;
	private int id;

	public Account(String n, String num, long z) {
		name = n;
		no = num;
		balance = z;
		id = ++counter;
	}

	public String getName() {
		return name;
	}

	public String getNo() {
		return no;
	}

	public Long getBalance() {
		return balance;
	}

	public int getId() {
		return id;
	}

	public void deposit(long k) {
		balance += k;
	}

	public void withdraw(long k) {
		balance -= k;
	}
}

class Account {
	String name;
	String no;
	long balance;
}

class AccountTester {

	public static void main(String[] args) {
		Account adachi = new Account();
		Account nakata = new Account();

		adachi.name 	= "足立幸一";
		adachi.no		= "123456";
		adachi.balance	= 1000;

		nakata.name 	= "仲田真二";
		nakata.no		= "654321";
		nakata.balance	= 200;

		adachi.balance -= 200;
		nakata.balance += 100;

		System.out.println("<足立君の口座>");
		System.out.println("　口座名義 : " + adachi.name);
		System.out.println("　口座番号 : " + adachi.no);
		System.out.println("　預金残高 : " + adachi.balance);

		System.out.println("<仲田君の口座>");
		System.out.println("　口座名義 : " + nakata.name);
		System.out.println("　口座番号 : " + nakata.no);
		System.out.println("　預金残高 : " + nakata.balance);

	}
}
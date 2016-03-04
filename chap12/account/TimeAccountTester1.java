
public class TimeAccountTester1 {
	
	public static void main(String[] args) {
		Account adachi = new Account("足立幸一", "123456", 1000);
		TimeAccount nakata = new TimeAccount("仲田真二", "654321", 200, 500);
		
		Account x;
		x = adachi;
		x = nakata;
		
		System.out.println("xの預金残高 : " + x.getBalance());
		
		TimeAccount y;
		// y = adachi;
		y = nakata;
		
		System.out.println("yの預金残高 : " + y.getBalance());
		System.out.println("yの定期預金残高 : " + y.getTimeBalance());		
	}
}

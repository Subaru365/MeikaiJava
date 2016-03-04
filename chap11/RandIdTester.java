import id.RandId;

public class RandIdTester {
	
	public static void main(String[] args) {
		RandId a = new RandId();
		RandId b = new RandId();
		RandId c = new RandId();
		
		System.out.println("aの識別子 : " + a.getId());
		System.out.println("bの識別子 : " + b.getId());
		System.out.println("cの識別子 : " + c.getId());
	}
}

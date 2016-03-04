import java.util.Random;

class RandId {
	private static int counter;
	
	private int id;
	
	static {
		Random rand = new Random();
		counter = rand.nextInt(10) * 100;
	}
	
	public RandId() {
		id = ++counter;
	}
	
	public int getId() {
		return id;
	}
}

public class RandldTester {
	
	public static void main(String[] args) {
		RandId a = new RandId();
		RandId b = new RandId();
		RandId c = new RandId();
		
		System.out.println("aの識別子 : " + a.getId());
		System.out.println("bの識別子 : " + b.getId());
		System.out.println("cの識別子 : " + c.getId());
	}
}

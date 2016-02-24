import java.util.Random;

class LuckyNo {

	public static void main(String[] args) {
		Random rand = new Random();

		int lucky = rand.nextInt(10);

		System.out.println("Lucky Number : " + lucky);
	}
}
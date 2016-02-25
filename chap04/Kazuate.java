import java.util.Random;
import java.util.Scanner;

class Kazuate {

	public static void main(String[] args) {
		Random rand   = new Random();
		Scanner stdIn = new Scanner(System.in);

		int no = rand.nextInt(100);
		System.out.println("!Question!");
		System.out.println("What number am I?");

		int x;
		do {
			System.out.print("Answer : ");
			x = stdIn.nextInt();

			if (x > no) {
				System.out.println("I'm so small..");
			}
			else if (x < no) {
				System.out.println("I'm so big!");
			}
		} while (x != no);

		System.out.println("That's right!");
	}
}
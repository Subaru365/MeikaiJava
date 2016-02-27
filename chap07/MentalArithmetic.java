import java.util.Random;
import java.util.Scanner;

class MentalArithmetic {

	static Scanner stdIn = new Scanner(System.in);

	static boolean confirmRetry() {
		int cont;
		do {
			System.out.print("Retry? <Yes:1/No:0> : ");
			cont = stdIn.nextInt();
		} while (cont != 0 && cont != 1);
		return cont == 1;
	}

	public static void main(String[] args) {
		Random rand = new Random();

		System.out.println("Training!");
		do {
			int x = rand.nextInt(900) + 100;
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;

			while (true) {
				System.out.printf("%d + %d + %d = ", x, y, z);
				int k = stdIn.nextInt();
				if (k == x + y + z) {
					break;
				}
				System.out.println("No...");
			}
		} while (confirmRetry());
	}
}
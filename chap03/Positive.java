import java.util.Scanner;

class Positive {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("Integer : ");
		int n = stdIn.nextInt();

		if (n > 0) {
			System.out.println("It's true.");
		}
	}
}
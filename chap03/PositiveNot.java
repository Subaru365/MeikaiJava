import java.util.Scanner;

class PositiveNot {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("Integer : ");
		int n = stdIn.nextInt();

		if (n > 0)
			System.out.println("It's true.");
		else
			System.out.println("It's false.");
	}
}
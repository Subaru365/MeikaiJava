import java.util.Scanner;

class EvenOdd {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("Integer : ");
		int n = stdIn.nextInt();

		if (n > 0)
			if (n % 2 == 0)
				System.out.println("It's even.");
			else
				System.out.println("It's odd.");
		else
			System.out.println("It isn't integer.");
	}
}
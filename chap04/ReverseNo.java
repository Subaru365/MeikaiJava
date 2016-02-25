import java.util.Scanner;

class ReverseNo {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("-ReverseNomber-");

		int x;
		do {
			System.out.print("Integer : ");
			x = stdIn.nextInt();
		} while (x <= 0);

		while (x > 0) {
			System.out.print(x % 10);
			x /= 10;
		}
	}
}
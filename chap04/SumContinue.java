import java.util.Scanner;

class SumContinue {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("What numbers do I have? : ");
		int n = stdIn.nextInt();

		int sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Integer : ");
			int t = stdIn.nextInt();
			if (t < 0) {
				System.out.println("Error! Minus number.");
				continue;
			}
			sum += t;
		}
		System.out.println("Sum : " + sum);
	}
}
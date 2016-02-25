import java.util.Scanner;

class SumBreak1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("What numbers do I have? : ");
		int n = stdIn.nextInt();

		int sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Integer (0:End) : ");
			int t = stdIn.nextInt();
			if (t == 0) {
				break;
			}
			sum += t;
		}
		System.out.println("Sum : " + sum);
	}
}
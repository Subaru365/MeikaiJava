import java.util.Scanner;

class OddNo {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("Integer : ");
		int n = stdIn.nextInt();

		for (int i = 1; i < n; i += 2) {
			System.out.println(i);
		}
	}
}
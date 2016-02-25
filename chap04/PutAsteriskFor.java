import java.util.Scanner;

class PutAsteriskFor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("What asterisk do you need? : ");
		int n = stdIn.nextInt();


		for (int i = 0; i < n; i++) {
			System.out.print('*');
		}
	}
}
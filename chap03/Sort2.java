import java.util.Scanner;

class Sort2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("a = "); int a = stdIn.nextInt();
		System.out.print("b = "); int b = stdIn.nextInt();

		if (a > b) {
			int t = a;
			a = b;
			b = t;
		}

		System.out.println("Minimum number is " + a);
		System.out.println("Maximum number is " + b);
	}
}
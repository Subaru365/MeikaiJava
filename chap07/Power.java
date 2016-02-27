import java.util.Scanner;

class Power {

	static double power(double x, int n) {
		double tmp = 1.0;

		while (n-- > 0) {
			tmp *= x;
		}
		return tmp;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("a : "); double a = stdIn.nextDouble();
		System.out.print("b : "); int b = stdIn.nextInt();

		System.out.println("a^b = " + power(a,b));
	}
}
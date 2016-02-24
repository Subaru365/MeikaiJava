import java.util.Scanner;

class ArithDouble {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("Four arithmetic operations x, y");

		System.out.print("x = ");
		double x = stdIn.nextDouble();

		System.out.print("y = ");
		double y = stdIn.nextDouble();

		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		System.out.println("x % y = " + (x % y));
	}
}
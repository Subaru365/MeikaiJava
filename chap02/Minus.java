import java.util.Scanner;

class Minus {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("a = ");
		int a = stdIn.nextInt();

		int b = -a;
		System.out.println("b = " + b);
	}
}
import java.util.Scanner;

class Min2Cond {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("a = "); int a = stdIn.nextInt();
		System.out.print("b = "); int b = stdIn.nextInt();

		int min = a < b ? a : b;
		System.out.println("Minimum number is " + min);
	}
}
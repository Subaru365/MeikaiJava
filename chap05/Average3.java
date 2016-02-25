import java.util.Scanner;

class Average3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("x = "); int x = stdIn.nextInt();
		System.out.print("y = "); int y = stdIn.nextInt();

		double ave = (double)(x + y) / 2;
		System.out.println("Average : " + ave);
	}
}
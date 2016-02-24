import java.util.Scanner;

class Circle2 {

	public static void main(String[] args) {
		final double PI = 3.1416; //円周率
		Scanner stdIn = new Scanner(System.in);

		System.out.print("radius = ");
		double r = stdIn.nextDouble();

		System.out.println("Circumference : " + PI * r * 2);
		System.out.println("Area : " + PI * r * r);
	}
}
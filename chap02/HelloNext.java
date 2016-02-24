import java.util.Scanner;

class HelloNext {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("What's your name?");
		System.out.print("Name : ");
		String s = stdIn.next();

		System.out.println("Hello! " + s);
	}
}
import java.util.Random;
import java.util.Scanner;

class MonthCAI {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		String[] monthString = {
			"January", "February", "March", "April", "May", "june", "July",
			"August", "September", "October", "December",
		};

		int month = rand.nextInt(12);
		System.out.println("What month " + monthString[month] + "?");

		while (true) {
			System.out.print("month : ");
			int m = stdIn.nextInt();

			if (m == month + 1) {
				break;
			} else {
				System.out.println("No...");
			}
		}
		System.out.println("It's true!");
	}
}
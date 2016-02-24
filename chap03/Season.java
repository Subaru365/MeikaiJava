import java.util.Scanner;

class Season {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("What month today?");
		System.out.print("Month : ");
		int month = stdIn.nextInt();

		if (month >= 3 && month <= 5)
			System.out.println("It's Spring!");
		else if (month >= 6 && month <= 8)
			System.out.println("It's Summer!");
		else if (month >= 9 && month <= 11)
			System.out.println("It's Autumn!");
		else if (month == 12 || month == 1 || month == 2)
			System.out.println("It's Winter!");
	}
}
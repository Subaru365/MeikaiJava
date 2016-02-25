import java.util.Scanner;

class FingerFlashing2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("Rock(0)-Paper(1)-Scissors(2) Go!");
		System.out.print("Your sign : "); 
		int hand = stdIn.nextInt();

		switch (hand) {
			case 0: System.out.println("Rock"); 	break;
			case 1: System.out.println("Paper"); 	break;
			case 2: System.out.println("Scissors"); break;
		}
	}
}
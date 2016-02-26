import java.util.Random;
import java.util.Scanner;

class LinearSearch {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		final int n = 12;
		int[] a = new int[n];

		for (int j = 0; j < n; j++) {
			a[j] = rand.nextInt(10);
		}

		System.out.print("Array a values\n{ ");
		for (int j = 0; j < n; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println("}");

		System.out.print("Search number : ");
		int key = stdIn.nextInt();

		int i;
		for (i = 0; i < n; i++) {
			if (a[i] == key) {
				break;
			}
		}

		if (i < n) {
			System.out.printf("It's a[%d]\n", i);
		} else {
			System.out.printf("It's nothing\n");
		}
	}
}
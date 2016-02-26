import java.util.Random;
import java.util.Scanner;

class ReverseArray {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("Integer : ");
		int n = stdIn.nextInt();
		int[] a = new int[n];

		System.out.print("{ ");
		for (int i = 0; i < n; i++) {
			a[i] = 10 + rand.nextInt(90);
			System.out.print(a[i] + " ");
		}
		System.out.println("}");

		for (int i = 0; i < n / 2; i++) {
			int t = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = t;
		}

		System.out.println("-Revers value-");
		System.out.print("{ ");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println("}");
	}
}
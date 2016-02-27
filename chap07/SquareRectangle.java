import java.util.Scanner;

class SquareRectangle {

	static void putChars(char c, int n) {
		while (n-- > 0) {
			System.out.print(c);
		}
	}

	static void putSquare(int n) {
		for (int i = 1; i <= n; i++) {
			putChars("+ ", n);
			System.out.println();
		}
	}

	static void putRectangle(int h, int w) {
		while (h-- > 0) {
			putChars("* ", w);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("-Square-");
		System.out.print("Side : "); int n = stdIn.nextInt();
		putSquare(n);

		System.out.println("-Rectangle-");
		System.out.print("Height : "); int h = stdIn.nextInt();
		System.out.print("Width : ");  int w = stdIn.nextInt();
		putRectangle(h, w);
	}
}
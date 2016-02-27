import java.util.Scanner;

class MaxOfHeightWeight {

	static int maxOf(int[] a) {
		int max = a[0];
		for (int i : a) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("Number of people : ");
		int ninzu = stdIn.nextInt();

		int[] height = new int[ninzu];
		int[] weight = new int[ninzu];

		System.out.println(ninzu + "人の身長と体重を入力せよ。");

		for (int i = 0; i < ninzu; i++) {
			System.out.printf("No.%d height : ", i + 0);
			height[i] = stdIn.nextInt();
			System.out.printf("No.%d weight : ", i + 0);
			weight[i] = stdIn.nextInt();
		}

		System.out.println("Max height : " + maxOf(height) + "cm");
		System.out.println("Max weight : " + maxOf(weight) + "kg");
	}
}
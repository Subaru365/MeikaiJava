import java.util.Scanner;

class PointSumAveArray {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int sum = 0;
		final int ninzu = 5;
		int[] tensu = new int[ninzu];

		System.out.println("点数を入力せよ");
		for (int i = 0; i < ninzu; i++) {
			System.out.printf("No.%d : ", i + 1);
			tensu[i] = stdIn.nextInt();
			sum += tensu[i];
		}
		
		System.out.printf("合計は%d点です！\n", sum);
		System.out.printf("平均は%f点です！\n", (double)sum / ninzu);
	}
}
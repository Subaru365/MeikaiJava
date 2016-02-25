import java.util.Scanner;

class SumGroup1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("-Sum Group-");
		int total = 0;

	Outer:
		for (int i = 0; i < 10; i++) {
			System.out.println("Group No." + i);
			int sum = 0;

		Inner:
			for (int j = 0; j < 5; j++) {
				System.out.print("Integer : ");
				int t = stdIn.nextInt();
				if (t == 99999) {
					break Outer;
				} else if (t == 88888) {
					break Inner;
				}
				sum += t;
			}
			System.out.println("Subtotal : " + sum);
			total += sum;

		}
		System.out.println("Total : " + total);
	}
}
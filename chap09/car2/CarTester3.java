import java.util.Scanner;

class CarTester3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("車のデータを入力せよ。");
		System.out.print("名前 : ");		String name = stdIn.next();
		System.out.print("車幅 : ");		int width 	= stdIn.nextInt();
		System.out.print("高さ : ");		int height 	= stdIn.nextInt();
		System.out.print("長さ : ");		int length 	= stdIn.nextInt();
		System.out.print("ガソリン量 : ");	double fuel	= stdIn.nextDouble();
		System.out.print("購入年 : ");	int y 		= stdIn.nextInt();
		System.out.print("購入月 : ");	int m 		= stdIn.nextInt();
		System.out.print("購入日 : ");	int d 		= stdIn.nextInt();
	
		Car car2 = new Car(name, width, height, length, fuel, new Day(y, m, d));

		car2.putSpec();
		System.out.println("購入日 : " + car2.getPurchaseDay());
	}
}
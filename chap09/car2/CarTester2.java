class CarTester2 {

	public static void main(String[] args) {
		Car myCar = new Car("愛車", 1885, 1490, 5220, 90.0, new Day(2000, 11, 18));

		myCar.putSpec();
		System.out.println("購入日: " + myCar.getPurchaseDay().toString());
	}
}
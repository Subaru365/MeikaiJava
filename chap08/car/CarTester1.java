class CarTester1 {
	public static void main(String[] args) {
		Car vitz = new Car("ビッツ", 1660, 1500, 3640, 40.0);
		Car march = new Car("マーチ", 1660, 1525, 3695, 41.0);

		vitz.putSpec();
		System.out.println();
		march.putSpec();
	}
}
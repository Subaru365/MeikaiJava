class FloatSum2 {

	public static void main(String[] args) {
		float sum = 0.0F;

		for (int i = 0; i <= 1000; i++) {
			float x = (float)i / 1000;
			System.out.println("x = " + x);
			sum += x;
		}
		System.out.println("sum = " + sum);
	}
}
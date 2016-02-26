class ArraySumForIn {

	public static void main(String[] args) {
		double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};

		for (int i = 0; i < a.length; i++) {
			System.out.printf("a[%d] = %1.1f\n", i, a[i]);
		}

		double sum = 0;
		for (double i : a) {
			sum += i;
		}

		System.out.printf("Sum : %1.1f\n", sum);
	}
}
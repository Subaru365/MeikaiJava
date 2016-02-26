class AssignArray {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {6, 5, 4, 3, 2, 1, 0};

		System.out.print("a = ");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.print("b = ");
		for (int i : b) {
			System.out.print(i + " ");
		}
		System.out.println();

		b = a;
		a[0] = 10;
		System.out.println("[b = a]");

		System.out.print("a = ");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.print("b = ");
		for (int i : b) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
class Matrix {

	public static void main(String[] args) {
		int[][] a = { {1, 2, 3}, {4, 5, 6} };
		int[][] b = { {6, 3, 4}, {5, 1, 2} };
		int[][] c = { {0, 0, 0}, {0, 0, 0} };

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}

		System.out.println("[Array a]");
		for (int[] i : a) {
			for (int j : i) {
				System.out.printf("%3d", j);
			}
			System.out.println();
		}

		System.out.println("[Array b]");
		for (int[] i : b) {
			for (int j : i) {
				System.out.printf("%3d", j);
			}
			System.out.println();
		}

		System.out.println("[Array c]");
		for (int[] i : c) {
			for (int j : i) {
				System.out.printf("%3d", j);
			}
			System.out.println();
		}
	}
}
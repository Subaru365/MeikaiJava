class AddMatrix {

	static void addMatrix(int[][] x, int[][] y, int[][] z) {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
	}

	static void printMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] a = { {1, 2, 3}, {4, 5, 6} };
		int[][] b = { {6, 3, 4}, {5, 1, 2} };
		int[][] c = new int[2][3];

		addMatrix(a, b, c);

		System.out.println("Array a : "); printMatrix(a);
		System.out.println("Array b : "); printMatrix(b);
		System.out.println("Array c : "); printMatrix(c);
	}
}
class PrintfTester {

	public static void main(String[] args) {
		System.out.printf("%d\n",  12345);
		System.out.printf("%3d\n", 12345);
		System.out.printf("%7d\n", 12345);
		System.out.printf("\n");

		System.out.printf("%5d\n",  123);
		System.out.printf("%05d\n", 123);
		System.out.printf("\n");

		System.out.printf("%d\n", 12345);
		System.out.printf("%o\n", 12345);
		System.out.printf("%x\n", 12345);
		System.out.printf("%X\n", 12345);
		System.out.printf("\n");

		System.out.printf("%f\n",    123.45);
		System.out.printf("%15f\n",  123.45);
		System.out.printf("%9.2f\n", 123.45);
		System.out.printf("\n");

		System.out.printf("XYZ\n");
		System.out.printf("%s\n",   "ABCDE");
		System.out.printf("%3s\n",  "ABCDE");
		System.out.printf("%10s\n", "ABCDE");
		System.out.printf("\n");
	}
}
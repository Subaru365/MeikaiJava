class DayArrayInit {

	public static void main(String[] args) {
		String[] wd = {"日","月","火","水","木","金","土"};

		Day[] x;
		x = new Day[]{
			new Day(1868,  9,  8),
			new Day(1912,  7, 30),
			new Day(1926, 12, 25),
			new Day(1989,  1,  8),
		};

		for (int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "] = "
				+ x[i].getYear()	+ "年"
				+ x[i].getMonth()	+ "月"
				+ x[i].getDate()	+ "日"
				+ wd[x[i].dayOfWeek()] + "曜日です。"
			);
		}
	}
}
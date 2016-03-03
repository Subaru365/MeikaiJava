
public class Day {
	private int year	= 1;
	private int month	= 1;
	private int date	= 1;

	public static boolean isLeap(int y) {
		return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
	}

	public Day() {
	}

	public Day(int year) {
		this.year 	= year;
	}

	public Day(int year, int month) {
		this(year);
		this.month 	= month;
	}

	public Day(int year, int month, int date) {
		this(year, month);
		this.date	= date;
	}

	public Day(Day d) {
		this(d.year, d.month, d.date);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public void set(int year, int month, int date) {
		this.year 	= year;
		this.month 	= month;
		this.date	= date;
	}

	public boolean isLeap() {
		return isLeap(year);
	}

	public int dayOfWeek() {
		int y = year;
		int m = month;
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}

	public String toString() {
		String[] wd = {"月","火","水","木","金","土"};
		return String.format("%4d年%02d月%02d日(%s)",
				year, month, date, wd[dayOfWeek()]);
	}
}

import java.util.GregorianCalendar;;
import static java.util.GregorianCalendar.*;

import java.sql.Date;

class DateId{
	private static int counter;
	private int id;
	
	static {
		GregorianCalendar today = new GregorianCalendar();
		int y = today.get(YEAR);
		int m = today.get(MONTH) + 1;
		int d = today.get(DATE);
		
		System.out.printf("今日は%04d/%02d/%02d\n", y, m, d);
		counter = y * 1000000 + m * 10000 + d * 100;
	}
	
	public DateId() {
		id = ++counter;
	}
	
	public int getId() {
		return id;
	}
}

public class DateIdTester {
	
	public static void main(String[] args) {
		DateId a = new DateId();
		DateId b = new DateId();
		DateId c = new DateId();
		
		System.out.println("aの識別子 : " + a.getId());
		System.out.println("bの識別子 : " + b.getId());
		System.out.println("cの識別子 : " + c.getId());
	}
}

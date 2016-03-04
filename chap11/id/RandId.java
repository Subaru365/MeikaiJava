package id;

import java.util.Random;

public class RandId {
	
	private static int counter;
	private int id;
	
	static {
		Random rand = new Random();
		counter = rand.nextInt(10) * 100;
	}
	
	public RandId() {
		id = ++counter;
	}
	
	public int getId() {
		return id;
	}
}


public class VirtLine extends AbstLine {
	
	public VirtLine(int length) {
		super(length);
	}
	
	public String toString() {
		return "VirtLine(length:" + getLength() + ")";
	}
	
	public void draw() {
		for (int i = 1; i <= getLength(); i++) {
			System.out.println('|');
		}
	}
}
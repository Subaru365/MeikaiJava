
public class ShapeTester {

	public static void main(String[] args) {
		Shape[] a = new Shape[2];
		a[0] = new Point();
		a[1] = new Rectangle(4, 3);
		
		for (Shape s : a) {
			s.draw();
			System.out.println();
		}
	}
}

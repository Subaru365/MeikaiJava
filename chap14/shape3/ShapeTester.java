
class ShapeTester {

	public static void main(String[] args) {
		Shape[] p = new Shape[4];
		
		p[0] = new Point();
		p[1] = new HorzLine(5);
		p[2] = new VirtLine(3);
		p[3] = new Rectangle(4, 3);
		
		for (Shape s : p) {
			s.print();
			System.out.println();
		}
	}
}
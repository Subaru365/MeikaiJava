public class PetTester2 {

	static void intro(Pet p) {
		p.introduce();
	}
	
	public static void main(String[] args) {
		Pet[] a = {
			new Pet("Kurt", "アイ"),
			new RobotPet("R2D2", "ルーク"),
			new Pet("マイケル", "英男"),
		};
		
		for (Pet p : a) {
			intro(p);
			System.out.println();
		}
	}
}

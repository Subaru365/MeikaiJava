
public class RobotPet extends Pet {

	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}
	
	public void introduce() {
		System.out.println("私はロボット。名前は" + getName() + "。");
		System.out.println("ご主人様は" + getMasterName() + "。");
	}
	
	public void work(int sw) {
		switch (sw) {
		case 0:
			System.out.println("掃除します。");
			break;
		
		case 1:
			System.out.println("洗濯します。");
			break;
			
		case 2:
			System.out.println("炊事します。");
			break;
		}
	}
}

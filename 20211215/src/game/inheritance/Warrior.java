package game.inheritance;

public class Warrior extends Commoner{
	private int pDam;
	
	public Warrior(String name) {
		super(name);
		this.pDam = 3;
	}

	public void getInfo() {
		System.out.println("레벨 : " + lv + ", 체력 : " + hp + 
				           ", 마나 : " + mp + ", 아이디 : " + name + 
				           ", 물리데미지 : " + pDam);
	}
	
}

package game.inheritance;

public class Commoner {
	protected int lv;
	protected int hp;
	protected int mp;
	protected String name;
	
	public Commoner(String name) {
		this.lv = 1;
		this.hp = 20;
		this.mp = 10;
		this.name = name;
	}

	public void getInfo() {
		System.out.println("레벨 : " + lv + ", 체력 : " + hp + 
				           ", 마나 : " + mp + ",  아이디 : " + name);
	}
}

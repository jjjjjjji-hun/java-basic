package game.interaction;

public class Thief {
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int exp;

	public Thief() {
		this.hp = 15;
		this.mp = 10;
		this.atk = 5;
		this.def = 1;
		this.exp = 0;
	}
	public void huntOrc(Orc orc) {
		orc.doBattle(this.atk);
		if(orc.getHp() > 0) {
			this.hp = this.hp + this.def - orc.getAtk();
		}else {
			System.out.println("오크를 처치하였습니다.");
		}
		System.out.println("교전 결과 도적의 체력 : " + this.hp);
	}
	public void huntTroll(Troll troll) {
		troll.doBattle(this.atk);
		if(troll.getHp() > 0) {
			this.hp = this.hp + this.def - troll.getAtk();
		}else {
		System.out.println("트롤을 처치하였습니다.");
		}
		System.out.println("교전 결과 도적의 체력 : " + this.hp);
	}
	public void huntSlime(Slime slime) {
		slime.doBattle(this.atk);
		if(slime.getHp() > 0) {
			this.hp = this.hp + this.def - slime.getAtk();
		}else {
		System.out.println("슬라임을 처치하였습니다.");
		}
		System.out.println("교전 결과 전사의 체력 : " + this.hp);
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
}

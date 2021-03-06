package game.interaction;

public class Troll {
	private int hp;
	private int atk;
	private int def;

	public Troll() {
		this.hp = 7;
		this.atk = 4;
		this.def = 1;
	}
	// coBattle은 유저의 공격력을 받아 오크의 체력을 차감합니다.
	public void doBattle(int uAtk) {
		// Troll의 체력을 유저 공격력 만큼 차감시켜주세요.
			hp = (hp + def) - uAtk;
			if(hp <= 0) {
				hp = 0;
				System.out.println("트롤이 처치 되었습니다.");
				return;// 메서드 강제로 종료시키는 기능
			}
			System.out.println("트롤의 남은 체력 : " + hp);
    }
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
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
	
}
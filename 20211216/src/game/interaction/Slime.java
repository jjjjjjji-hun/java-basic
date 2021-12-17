package game.interaction;

public class Slime {
	private int hp;
	private int atk;
	private int def;
	
	public Slime(){
		this.hp = 10;
		this.atk = 5;
		this.def = 3;
	}
	
	public void doBattle(int uAtk) {
		// Troll의 체력을 유저 공격력 만큼 차감시켜주세요.
			hp = (hp + def) - uAtk;
			if(hp <= 0) {
				hp = 0;
				System.out.println("슬라임이 처치 되었습니다.");
				return;// 메서드 강제로 종료시키는 기능
			}
			System.out.println("슬라임의 남은 체력 : " + hp);
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

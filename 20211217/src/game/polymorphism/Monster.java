package game.polymorphism;

public class Monster {
	
	// name(몬스터종류), hp, atk
	private String name;
	private int hp;
	private int atk;
	
	// 생성자까지 만들어주세요
	public Monster(String name, int hp, int atk) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}
	
	//doBattle(int)를 생성
	// 사용자의 공격력만큼 몬스터의 체력이 깎입니다.
	// 0이 되면 교전이 불가능하다는 메세지를 남겨줍니다.
	// 체력이 0보다 높은 경우에는 남은 체력을 마지막에 콘솔창에 띄워줍니다.
	public void doBattle(int uAtk) {
		this.hp = this.hp - uAtk;//uAtk는 사용자의 공격력, this.hp는 몬스터체력
		if(this.hp <= 0) {
			System.out.println(this.name + "이/가 처치되었습니다.");
			return; // 조건식이 참이면 메서드를 빠져나옴.
		}
			System.out.println("몬스터가 공격받았습니다. 남은 체력 : " + this.hp);
	}
	// getter / setter 생성
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
}

package game.accessmodifier;

public class Warrior extends Commoner{
	
	public Warrior(String name) {
		super(name);
	}
	
	public void hunt() {
		System.out.println("전사가 사냥을 시작합니다.");
		setHp(getHp()-2);
		setExp(getExp()+10);
	}
	public void doubleAttack() {
		System.out.println("전사가 더블어택을 사용했습니다.");
		setExp(getExp()+25);
		setHp(getHp()-4);
	}
	public void getInfo() {
		// 심지어 private요소는 수정이아닌 조회도 불가능합니다.
		System.out.println("현재 체력 : " + getHp());
		System.out.println("현재 마나 : " + getMp());
		System.out.println("현재 레벨 : " + getLv());
		System.out.println("현재 경험치 : " + getExp());
		System.out.println("현재 유저명 : " + getName());
    }
}
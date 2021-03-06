package game.polymorphism;

public class Commoner {
	// 속성(필드, 변수)값으로 name, hp, mp, atk을 추가해주세요.
	private String name;
	private int hp;
	private int mp;
	private int atk;
	// 생성자로 위 필드를 초기화하도록 설정해주세요.
	public Commoner(String name) {
	this.name = name;
	this.hp = 20;
	this.mp = 10;
	this.atk = 4;
	}
	
	// 다형성을 적용해서 어떤 몬스터가 오더라도 이 메서드 하나로 처리함.
	// 몬스타타입이 없어서 에러가 나므로 우선 같은 패키지내에 Monster를 생성
	public void hunt(Monster monster) {
		monster.doBattle(this.atk);
		if(monster.getHp() > 0) {
		this.hp = this.hp - monster.getAtk();
	}else {
		System.out.println(monster.getName() + "을/를 처치하였습니다.");
	}
		System.out.println("교전 후 " + this.name + "의 남은 체력 : " + this.hp);
    }
}
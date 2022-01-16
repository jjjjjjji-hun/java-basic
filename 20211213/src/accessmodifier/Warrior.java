package accessmodifier;

public class Warrior {// 정의부, 실제 실행은 Main에서 할 예정임.
	// hp, mp, lv, atk, def, exp, name;
	// 선언 변수값은 현실에서도 특정한 물체나 사람의 상태가 휙휙 바뀌지 않으므로
	// 외부에서 값을 함부로 고칠 수 없도록 private으로 처리합니다.
	private String name;
	private int hp;
	private int mp;
	private int lv;
	private int atk;
	private int def;
	private int exp;
	
	// 생성자를 만들어주시되, name 만 사용자에게 입력받고, 나머지는
	// 체력20, 마나10, 레벨1, 공격력3, 방어력0, 경험치0이 대입되도록 처리해주세요.
	
	public Warrior(String n) {
		name = n;
		hp = 20;
		mp = 10;
		lv = 1;
		atk = 3;
		def = 0;
		exp = 0;
		System.out.println("생성된 캐릭터의 아이디 : " + name + 
				           ", 체력 : " + hp + ", 마나 : " + mp +
				           ", 레벨 : " + lv + ", 공격력 : " + atk +
				           ", 방어력 : " + def + ", 경험치 : " + exp);
	}

	// hunt 메서드를 만들어보겠습니다.
	// 이 메서드는 실행시 사냥을 하는데 체력이 2깎이고 경험치가 10 올라갑니다.
	// 사냥 결과 체력이 X이 되었고, 누적 경험치는 Y입니다. 라고 출력합니다.
	// 생성자를 비롯한 메서드는 행동을 나타내고
	// 이런 행동의 성공/실패 여부는 오로지 정보(변수)에 의해 결정되며
	// 시도 자체에 대해서는 제한을 두지 않습니다.
	public void hunt() {
		hp -= 2;
		exp += 20;
		System.out.println("사냥 결과 체력이 " + hp + "가 되었고, 누적 경험치는 " + exp + "입니다.");
	}
	public void levelUp() {
		lv += 1;
		exp = 0;
		System.out.println("1레벨 상승하였습니다.");
		System.out.println("레벨 : " + lv);
	}
	public void healing() {
		hp += 10;
		System.out.println("체력이 10만큼 회복되었습니다." + hp);
	}
}
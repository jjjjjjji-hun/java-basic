package game.interaction;

public class Main03 {

	public static void main(String[] args) {
		// 캐릭터 생성
		Thief t1 = new Thief();
		Orc o1 = new Orc();
		Troll tr1 = new Troll();
		t1.huntOrc(o1);
		t1.huntTroll(tr1);
		
		Magician a1 = new Magician();
		Orc o2 = new Orc();
		Troll tr2 = new Troll();
		a1.huntOrc(o2);
		a1.huntTroll(tr2);

	}

}

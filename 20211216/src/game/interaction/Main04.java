package game.interaction;

public class Main04 {

	public static void main(String[] args) {
		Warrior w1 = new Warrior();
		Thief t1 = new Thief();
		Magician m1 = new Magician();
		
		Orc o1 = new Orc();
		Troll tr1 = new Troll();
		Slime s1 = new Slime();
		
		w1.huntOrc(o1);
		t1.huntSlime(s1);
		m1.huntTroll(tr1);
	}

}

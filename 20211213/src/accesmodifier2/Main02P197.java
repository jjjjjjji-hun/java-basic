package accesmodifier2;

import accessmodifier.Warrior;

public class Main02P197 {

	public static void main(String[] args) {
		Warrior w1 = new Warrior("타락파워전사");
		// w1.hp = 1000000;
		// hp가 package friendly일때
		// package가 달라서 hp변경불가
		w1.hunt();
		w1.hunt();
		w1.hunt();
	}
}

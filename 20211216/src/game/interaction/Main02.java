package game.interaction;

public class Main02 {

	public static void main(String[] args) {
		// 전사를 만들어주세요.
		Warrior w1 = new Warrior();
		// 트롤을 만들어주세요.
		Troll t1 = new Troll();
		// 전사의 huntTroll을 호출해주세요.
		w1.huntTroll(t1);
		w1.huntTroll(t1);
		w1.huntTroll(t1);
		}

}

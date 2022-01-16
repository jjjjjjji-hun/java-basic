package accessmodifier;

public class MainP197 {

	public static void main(String[] args) {
		// 전사를 하나 만들고 메서드를 이용하세요.
		
		Warrior w1 = new Warrior("전사전사");
		// w1.hp = 100000; // private 요소 hp는 main지역에서 직접 값 못바꿈
		w1.hunt();
		w1.hunt();
		w1.hunt();
		w1.healing();
		w1.hunt();
		w1.hunt();
		w1.levelUp();
	}
}
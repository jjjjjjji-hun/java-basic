package constructor;

public class Main02P204 {

	public static void main(String[] args) {
		// 선수 2명을 만들어주세요.
		// 한 명은 성공, 다른 한 명은 실패
		BasketballPlayer a = new BasketballPlayer(180, 130);
		
		a.dunkShoot();

		BasketballPlayer b = new BasketballPlayer(170, 120);
		
		b.dunkShoot();
	}

}

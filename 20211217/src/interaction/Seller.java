package interaction;

public class Seller {
	private int money;
	private int apple;
	private int melon;
	
	public Seller(int apple, int melon) {
		this.money = 0;
		this.apple = apple;
		this.melon = melon;
	}

	public void sellApple(int apple) {
		if(this.apple < apple) {
			System.out.println("사과가 부족합니다.");
			return;
		}
		this.apple -= apple;
		this.money += apple * 3000;
		System.out.println(apple * 3000 + "원을 받았습니다.");
	}
	
	public void sellMelon(int melon) {
		if(this.melon < melon) {
			System.out.println("멜론이 부족합니다.");
			return;
		}
		this.melon -= melon;
		this.money += melon * 2000;
		System.out.println(melon * 2000 + "원을 받았습니다.");
	}
	public void showSeller() {
		System.out.println("---------상인정보--------");
		System.out.println("남은 사과 개수 : " + this.apple + ", 남은 멜론 개수 : " + this.melon);
		System.out.println("매출액 : " + this.money);
		System.out.println("-----------------------");
	}

	public int getApple() {
		return this.apple;
	}

	public int getMelon() {
		return this.melon;
	}

}

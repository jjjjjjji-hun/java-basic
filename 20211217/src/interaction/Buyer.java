package interaction;

public class Buyer {
	private int money;
	private int apple;
	private int melon;
	
	public Buyer(int money) {
		this.money = money;
		this.apple = 0;
		this.melon = 0;
	}
	public void buyApple(Seller seller, int apple) {
		if(apple*3000 > this.money) {
			System.out.println("돈이 부족합니다. 소지금 : " + this.money);
			return;
		}
		if(seller.getApple() < apple) {
			System.out.println("사과 재고가 부족합니다.");
			return;
		}
		this.money -= apple * 3000;
		this.apple += apple;
		seller.sellApple(apple);
		System.out.println(apple * 3000 + "원을 지불했습니다.");
	}
	
	public void buyMelon(Seller seller, int melon) {
		if(melon*2000 > this.money) {
			System.out.println("돈이 부족합니다. 소지금 : " + this.money);
			return;
		}
		if(seller.getMelon() < melon) {
			System.out.println("멜론 재고가 부족합니다.");
			return;
		}
		this.money -= melon*2000;
		this.melon += melon;
		seller.sellMelon(melon);
		System.out.println(melon*2000 + "원을 지불했습니다.");
	}
	public void showBuyer() {
		System.out.println("-----------구매자 정보---------");
		System.out.println("구매한 사과 개수: " + this.apple + ", 구매한 멜론 개수 : " + this.melon + 
				           ", 소지금 : " + this.money);
		System.out.println("-----------------------------");
	}
}

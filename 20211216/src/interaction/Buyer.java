package interaction;

public class Buyer {
	private int money;
	private int mango;
	
	public Buyer(int money) {
		this.money = money;
		this.mango = 0;
	}
	public void buyMango(Seller seller, int mango) {
		// 구매하려는 망고총액이 내 소지금을 넘어서면 "돈이 모자랍니다."라고만 알리고 메서드 중지
		if(mango*4000 > this.money) {
			System.out.println("돈이 모자랍니다.");
			return;
		}
		// 판매자의 망고가 내가 구매하려는 망고보다 적은경우도 역시 "망고재고가 부족합니다." 라고만 알리고 메서드 중지
		if(seller.getMango() < mango) {
			System.out.println("망고재고가 부족합니다.");
			return;
		}
		this.money -= mango * 4000;
		this.mango += mango;
		// seller쪽에서도 sellMango()가 호출되도록 처리하며 seller의 망고를 차감하고 돈을 올려주는 로직
		seller.sellMango(mango);
		System.out.println(mango * 4000 + "원을 지불했습니다.");
		
	}
	public void showBuyer() {
		System.out.println("--------구매자 정보--------");
		System.out.println("현재 소지 망고 : " + this.mango + ", 소지금 : " + this.money);
		System.out.println("-------------------------");
	}

}
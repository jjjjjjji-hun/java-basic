package interaction;

public class Seller {
	private int money;//매출액
	private int mango;//재고(개수)
	
	public Seller(int mango) {
		this.money = 0;
		this.mango = mango;
	}

	public void sellMango(int mango) {
		// 내가 파려는 망고 개수보다 사가려는 망고 개수가 많을때
		if(this.mango < mango) {
			System.out.println("망고가 모자랍니다. 현재 재고 : " + this.mango);
			return;
		}
		this.mango -= mango;
		this.money += mango * 4000;
		System.out.println(mango * 4000 + "원을 받았습니다.");
	}
	public void showSeller() {
		System.out.println("----------상인정보---------");
		System.out.println("남은 망고 개수는 : " + this.mango);
		System.out.println("현재 소지금 : " + this.money + "원 입니다.");
		System.out.println("-------------------------");
	}
	public int getMango() {
		return mango;
	}

}

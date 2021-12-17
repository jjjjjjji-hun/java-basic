package interaction;

public class Main01 {

	public static void main(String[] args) {
		Seller s1 = new Seller(10, 15);
		Seller s2 = new Seller(15,10);
		Buyer b1 = new Buyer(300000);
		
		s1.showSeller();
		s2.showSeller();
		b1.showBuyer();
		
		b1.buyApple(s1, 10);
		b1.buyMelon(s2, 10);
		
		s1.showSeller();
		s2.showSeller();
		b1.showBuyer();

	}

}

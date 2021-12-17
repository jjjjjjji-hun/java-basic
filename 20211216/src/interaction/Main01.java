package interaction;

public class Main01 {

	public static void main(String[] args) {
		Seller s1 = new Seller(30);
		Seller s2 = new Seller(5);
		Buyer b1 = new Buyer(100000);
		
		s1.showSeller();
		s2.showSeller();
		b1.showBuyer();
		
		System.out.println("===========s2에게 구매==========");
		b1.buyMango(s2, 5);

		s1.showSeller();
		s2.showSeller();
		b1.showBuyer();
		
		System.out.println("===========s1에게 구매==========");
		b1.buyMango(s1, 10);
		
		s1.showSeller();
		s2.showSeller();
		b1.showBuyer();
		
	}

}

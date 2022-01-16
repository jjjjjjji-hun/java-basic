package structure;

public class ClassMain02P196 {

	public static void main(String[] args) {
		Car a = new Car();
		a.model = "쏘렌토";
		a.price = 50000000;
		a.owner = "김자바";
		
		Car b = new Car();
		b.model = "니로";
		b.price = 60000000;
		b.owner = "최언어";
		
		a.getInfo();
		b.getInfo();
	}
}
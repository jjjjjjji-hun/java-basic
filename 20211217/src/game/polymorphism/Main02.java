package game.polymorphism;

public class Main02 {

	public static void main(String[] args) {
		Commoner c1 = new Commoner("초보자");
		Monster d1 = new Dragon();
		Monster t1 = new Troll();
		Monster s1 = new Slime();
		
		c1.hunt(t1);
		c1.hunt(d1);
		c1.hunt(s1);
	}
}

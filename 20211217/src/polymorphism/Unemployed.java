package polymorphism;

public class Unemployed extends Person{

	private int money;//저축액
	
	public Unemployed(String name, int age, int money) {
		super(name, age);
		this.money = money;
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("저축한 금액 : " + money);
	}
}

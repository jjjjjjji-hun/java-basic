package polymorphism;

public class Employee extends Person{

	private int money; //연봉
	
	public Employee(String name, int age, int money) {
		super(name, age);
		this.money = money;
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("연봉 : " + money);
	}
}

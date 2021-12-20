package casting;

public class Cat extends Animal{

	public Cat(String name, int age) {
		super(name, age);
	}
	public void punch() {
		System.out.println("펀치를 합니다.");
	}
	public void sit() {
		System.out.println("고양이가 앉습니다.");
	}
}

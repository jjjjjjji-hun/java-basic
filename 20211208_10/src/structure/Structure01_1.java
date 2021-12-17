package structure;

public class Structure01_1 {
	
	public static void getinfo(Dog d) {
		System.out.println(d.name);
		System.out.println(d.age);
		System.out.println(d.type);
	}

	public static void main(String[] args) {
		//개 2마리를 만들어 보세요.
		Dog a = new Dog();
		a.name = "해피";
		a.age = 4;
		a.type = "시츄";
		
		Dog b = new Dog();
		b.name = "초코";
		b.age = 3;
		b.type = "요크셔테리어";
		
		getinfo(a);
		getinfo(b);
		

	}

}

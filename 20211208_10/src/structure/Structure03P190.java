package structure;

public class Structure03P190 {
	
	public static void getCatInFo(Cat c) {
		System.out.println("이름 : " + c.name);
		System.out.println("나이 : " + c.age);
		System.out.println("종류 : " + c.type);
	}
	public static void main(String[] args) {
		Cat a = new Cat();
		a.name = "야옹이";
		a.age = 7;
		a.type = "페르시안";
		
		Cat b = new Cat();
		b.name = "냐옹이";
		b.age = 5;
		b.type = "러시안블루";
		
		getCatInFo(a);
		getCatInFo(b);		

	}

}

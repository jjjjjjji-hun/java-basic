package polymorphism;

public class Main02P302 {

	public static void main(String[] args) {
		Person p1 = new Person("나사람", 15);
		Person e1 = new Employee("나회사원", 30, 50000000);
		Person u1 = new Unemployed("나백수", 35, 100000000);
		
		p1.showPerson();
		System.out.println("------");
		e1.showPerson();
		System.out.println("------");
		u1.showPerson();

	}

}

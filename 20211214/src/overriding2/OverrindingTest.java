package overriding2;

public class OverrindingTest {

	public static void main(String[] args) {
		Employee m1 = new Manager();
		m1.name = "김지훈";
		System.out.println(m1.getDetails());
	

	}

}

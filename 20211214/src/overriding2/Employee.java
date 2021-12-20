package overriding2;

public class Employee {
	protected String name;
	private int salary;
	
	public String getDetails() {
		return "Name : " + name + "\n" + "Salary : " + salary;
	}

}

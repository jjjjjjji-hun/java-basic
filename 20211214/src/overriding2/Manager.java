package overriding2;

public class Manager extends Employee{
	private String department;
	
	public String getDetails() {
		return "Name : " + name + "\n" + "Manager of : " + department;
	}

}

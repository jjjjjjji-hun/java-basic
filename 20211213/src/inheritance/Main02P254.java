package inheritance;

public class Main02P254 {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "김자바";
		st1.age = 25;
		st1.stuNum = 1511012;
		
		st1.getInfo();
		st1.getStudentInfo();
		
		Salaryman sm1 = new Salaryman();
		sm1.name = "김지훈";
		sm1.age = 26;
		sm1.salary = 100000000;
		
		sm1.getInfo();
		sm1.getSalaryInfo();

	}

}

package polymorphism;

public class Student extends Person{

	// 학생의 등급인 grade를 선언합니다.
	private int grade;
	
	// super()를 이용해 Person(부모)생성자까지 커버하는 생성자를 만들어주세요.
	// grade까지 입력을 받습니다.
	// 부모쪽에서 쓸 자원인 String name, int age를 받고
	// Student 자신이 쓸 자원인 int grade 이렇게 3개를 입력요청합니다
	public Student(String name, int age, int grade) {
		// 부모쪽 생성자에 name, age를 넘겨주기 위해
		// super(name, age);를 호출하고
		// 자식쪽에서는 grade
		super(name, age);
		this.grade = grade;
	}
	
	// 상속받은 showPerson을 활용한 메서드 작성
	public void showPerson() {
		// 부모쪽 메서드 호출
		super.showPerson();// 이름과 나이를 콘솔에 찍어주는 구문
		System.out.println("학생의 성적 : " + grade);
	}
	public void showStudent() {
		System.out.println("이름 : " + super.getName() + ", 나이 : " + super.getAge() + 
				           ",  학생의 성적 : " + grade);
	}
}

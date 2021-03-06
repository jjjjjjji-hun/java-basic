package polymorphism;

public class Main01P302 {

	public static void main(String[] args) {
		// 부모타입인 Person으로 자식인 Student까지 받을 수 있음.
		Person p1 = new Person("나사람", 10);
		Person s1 = new Student("나학생", 20, 100);
		Student s2 = new Student("다학생", 20, 90);
	
		// p1과 s1의 showPerson은 다르게 돌아갑니다.
		p1.showPerson();//Person측 showPerson()호출
		s1.showPerson();//Student측 showPerson()호출
		s2.showStudent();//Student측 showStudent()호출
		
		// s1을 조회용 showStudent()를 이용해 호출시도해보세요.
		// s1은 Person 타입이므로 Person에 소속된 자원만 호출할 수 있습니다.
		// s1.showStudent(); 에러
	}
}
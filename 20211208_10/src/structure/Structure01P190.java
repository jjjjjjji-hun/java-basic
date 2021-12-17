package structure;

public class Structure01P190 {

	public static void main(String[] args) {
		// 이제부터는 실행코드와 정의 코드를 분리합니다.
		// main이 있는 클래스는 실행만 하고
		// 실제 로직은 다른.java파일에 저장합니다.
        
		// 커스텀 디자인 자료형은
		// 아래와 같이 new 자료형(); 문법으로 생성
		Person p1 = new Person();
		// p1 내부에 정의한 변수를
		// p1.변수명 = 대입할 값; 형태로 저장합니다.
		p1.name = "김지훈";
		System.out.println(p1.name);
		p1.age = 26;
		System.out.println(p1.age);
		p1.pNum = "010-1234-5678";
		System.out.println(p1.pNum);
		p1.uNum = 7777;
		System.out.println(p1.uNum);
		
		// 또 다른 사람을 하나 만들어봅니다.
		Person p2 = new Person();
		p2.name = "김쥐희";
		System.out.println(p2.name);
		p2.age = 22;
		System.out.println(p2.age);
		p2.pNum = "010-5678-1234";
		System.out.println(p2.pNum);
		p2.uNum = 3333;
		System.out.println(p2.uNum);
	}

}

package structure;

public class Structure02P190 {
	
	// Person 내부의 정보를 쉽게 조회하기 위한 메서드 생성
	public static void getInFo(Person p){
		System.out.println(p.name + "의 정보입니다.");
		System.out.println("이름 : " + p.name + ", 나이 : " + p.age + ", 연락처 : " + p.pNum + ", 번호 : " + p.uNum);
	}

	public static void main(String[] args) {
		// 사람을 두 명 만들어보세요(a, b)
		Person a = new Person();
		a.name = "캐논슈터";
		a.age = 3;
		a.pNum = "010-8391-1927";
		a.uNum = 17;
		
		Person b =new Person();
		b.name = "루미너스";
		b.age = 6;
		b.pNum = "010-3871-1724";
		b.uNum = 41;
		
		getInFo(a);
		getInFo(b);

	}

}

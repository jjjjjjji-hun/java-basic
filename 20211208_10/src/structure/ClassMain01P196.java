package structure;

public class ClassMain01P196 {
	// PersonClass의 메서드는 작성할 필요가 없습니다.
	// 이미 PersonClass의 내부에 필요한 메서드를 다 작성해놨기 때문입니다.

	public static void main(String[] args) {
		// 사람을 두 명 만들어 보세요.
		PersonClass a = new PersonClass();
		a.name = "체키";
		a.age = 14;
		a.pNum = "010-1234-5432";
		a.uNum = 12;
		a.hieght = 154;
		
		PersonClass b = new PersonClass();
		b.name = "쵸키";
		b.age = 15;
		b.pNum = "010-5321-5741";
		b.uNum = 16;
		b.hieght = 164;
		// 만든 사람 두명의 정보를 콘솔에 찍어보세요.
		a.getInfo();
		b.getInfo();
	}
}
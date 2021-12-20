package static1;

public class Main02P267 {

	public static void main(String[] args) {
		// static변수는 생성 없이도 활용할 수 있다.
		System.out.println(StaticTest.num2);// main지역이 열리기 전에 static지역에 num2가 생성됬기 때문에 참조 가능
		// System.out.println(StaticTest.num1); 에러 : non-static static이 아닌 것은 참조 불가능
		// static 메서드도 설정 가능하며 나머지 사항은 변수와 같습니다.
		StaticTest.check();
	}

}

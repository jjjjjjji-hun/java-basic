package overriding;

public class Main01P265 {

	public static void main(String[] args) {
		// 갈매기와 수사슴을 생성해보겠습니다.
		Seagull s1 = new Seagull();
		s1.howl();
		s1.name = "매기";
		s1.age = 13;
		s1.fly = true;
		s1.getInfo();

		Antler a1 = new Antler();
		a1.howl();
		a1.name = "디어";
		a1.age = 17;
		a1.horn = true;
		a1.speed = 50;
		a1.getInfo();
	}
}
package overriding;

public class Antler extends Animal{

	public int speed;
	
	public void howl() {
		System.out.println("숫사슴은 bell");
	}
	public void getInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age + 
				           ", 뿔 : " + horn + ", 스피드 : " + speed); 
	}
}

package overriding;

public class Seagull extends Animal{
	
	public boolean fly;
	
	// 오버라이딩 요건
	// 이름과 리턴자료형 등이 같은 부모쪽 메서드를
	//중복해서 작성함.
	public void howl() {
		System.out.println("갈매기는 끼룩끼룩");
	}
	public void getInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age + 
				           ", 뿔 : " + horn + ", 날개 : " + fly);
	}
}
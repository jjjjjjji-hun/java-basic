package overriding;

public class Animal {
	public String name;
	public int age;
	public boolean horn;

	public void howl() {
		System.out.println("동물이 웁니다.");
	}
	public void getInfo() {
		System.out.println("이름 : " + name + ", 나이는 : " + age + ", 뿔은 : " + horn);
	}
}


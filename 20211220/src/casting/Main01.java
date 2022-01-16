package casting;

public class Main01 {

	public static void main(String[] args) {
		// Animal 타입은 어떤 자료형이건 받을 수 있다.
		// Cat, Dog, Animal을 하나씩 만들어주세요.
		// Animal c1, d1, a1 으로 받아주세요.
		Animal c1 = new Cat("냐옹", 3);
		Animal d1 = new Dog("멍멍", 4);
		Animal a1 = new Animal("동물", 5);
		
		// c1, d1, a1에 .sit()을 각각 호출해보세요.
		c1.sit();
		d1.sit();
		a1.sit();
		
		// 각 자료형에 맞는 변수로 바꿔서 대입하겠습니다.
		Cat cat = (Cat) c1;// c1은 Animal타입이지만 힙에 저장된 데이터가
		// Cat이므로 Cat으로 변환 가능
		cat.punch();
		// Dog 에 대해서도 똑같이 해주세요.
		Dog dog = (Dog) d1;// Animal 자료형들의 힙 주소는 Dog의 dog 자료형의 힙주소와 같지만
		// Animal까지만 영향을 미칠지 dog까지 영향을 미칠지에 대해 차이점이있음.
		dog.bark();
	}
}
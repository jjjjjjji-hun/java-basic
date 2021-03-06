package superclass;

public class Airplane {
	// 비행기는 속도를 가집니다.
	// 생성자는 속도를 입력한 값으로 맞춰줍니다.
	// fly()메서드를 정의하는데  속도가 500씩 붙습니다.
	// 단, 일반 비행기는 속도가 900초과일 수 없습니다.
	//breakSpeed() 메서드를 수행하면 속도가 100씩 감속합니다.
	// 단, 브레이크 구동의 최저 속도는 0입니다.
	protected int velocity;
		
	public Airplane(int velocity) {
		this.velocity = velocity;
	}
	public void fly() {
		if(velocity + 500 > 900) {
			velocity = 900;
		}else {
			velocity += 500;
		}
		System.out.println("현재 비행기는 " + velocity + "km/h 로 비행중.");
	}
	public void breakSpeed() {
		if(velocity - 100 <= 0) {
			velocity = 0;
			System.out.println("비행기가 착륙합니다.");
		}else {
			velocity -= 100;
			System.out.println("감속결과 " + velocity + "km/h 로 비행중.");
	}
  }
}
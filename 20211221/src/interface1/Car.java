package interface1;

// interface구현 (상속이 아님!)하기 위해서는 extends 대신에 implements를 사용합니다.
// 인터페이스 내부의 추상메서드는 무조건 전부 구현해야 합니다.
public class Car implements Vehicle{
	// 자동차라면 가져야 하는 변수 설정
	// 현재속도, 현재연료량, 차주
	private int speed;
	private int gas;
	private String name;
	
	// 생성자를 만들어 주세요. 차주만 입력받고 나머지 요소는 현재속도 0, 연료량 100을 자동으로 대입
	public Car(String name) {
		this.speed = MIN_SPD;
		this.gas = CAR_MAX_GAS;
		this.name = name;
	}
	@Override
	public void accel() {
		// 한 번 가속시 속도가 10씩 늘어나도록 해 주세요.
		// 연료는 한 번 가속에 1씩 소비합니다. 단, 속도는 200을 초과할 수 없습니다.
		if(this.speed + CAR_INCREASE_SPD > CAR_MAX_SPD) {
			this.speed = CAR_MAX_SPD;
		}else {
			this.speed += CAR_INCREASE_SPD;
		}
		if(this.gas > MIN_GAS) {
			this.gas -= CAR_DECREASE_GAS;	
		}else {
			this.gas = MIN_GAS;
		}
	}
	@Override
	public void breakSpeed() {
		// 한 번 감속할때마다 속도가 10씩 줄도록 해주세요.
		// 단, 속도가 0 미만이 될 수 없습니다.
		if(this.speed - CAR_DECREASE_SPD < MIN_SPD) {
			this.speed = MIN_SPD;
		}else {
			this.speed -= CAR_DECREASE_SPD;
		}	
	}
	@Override
	public void reFuel() {
		// 한 번 주유할 때마다 연료가 30씩 충전됩니다.
		// 단, 연료량이 100을 초과할 수 없습니다.(상수 MAX_GAS)
		if(this.gas + CAR_INCREASE_GAS > CAR_MAX_GAS) {
			this.gas = CAR_MAX_GAS;
		}else {
			this.gas += CAR_INCREASE_GAS;
		}
	}
	@Override
	public void showStatus() {
		// 자동차의 정보를 조회할 수 있도록 작성해주시면 됩니다.
		System.out.println("현재속도 : " + this.speed + ", 현재 연료량 : " + this.gas + 
				           ", 차주 : " + this.name);
		System.out.println("--------------------------");	
	}
}
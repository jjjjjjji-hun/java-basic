package interface1;

public class Airplane implements Vehicle{

	private int speed;
	private int gas;
	private String name;
	
	public Airplane(String name) {
		this.speed = MIN_SPD;
		this.gas = AIRPLANE_MAX_GAS;
		this.name = name;
	}

	@Override
	public void accel() {
		// 최대 속도 900, 가속 400씩, 연료는 150씩 소비
		if(this.speed + AIRPLANE_INCREASE_SPD > AIRPLANE_MAX_SPD) {
			this.speed = AIRPLANE_MAX_SPD;
		}else {
			this.speed += AIRPLANE_INCREASE_SPD;
		}
		if(this.gas - AIRPLANE_DECREASE_GAS < MIN_GAS) {
			this.gas = MIN_GAS;
		}else {
			this.gas -= AIRPLANE_DECREASE_GAS;
		}
	}
	@Override
	public void breakSpeed() {
		// 감속 300씩 최저 속도 0
		if(this.speed - AIRPLANE_DECREASE_SPD < MIN_SPD) {
			this.speed = MIN_SPD;
		}else {
			this.speed -= AIRPLANE_DECREASE_SPD;
		}	
	}
	@Override
	public void reFuel() {
		// 연료 충전시 500씩 충전
		if(this.gas + AIRPLANE_INCREASE_GAS > AIRPLANE_MAX_GAS) {
			this.gas = AIRPLANE_MAX_GAS;
		}else {
			this.gas += AIRPLANE_INCREASE_GAS;
		}
	}
	@Override
	public void showStatus() {
		// 비행기의 정보를 조회
		System.out.println("현재속도 : " + this.speed + ", 현재 연료량 : " + this.gas + 
		           ", 기관사명 : " + this.name);
		System.out.println("--------------------------");	
	}
}

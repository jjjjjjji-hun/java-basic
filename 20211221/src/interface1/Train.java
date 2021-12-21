package interface1;

public class Train implements Vehicle{
	
	private int speed;
	private int gas;
	private String name;
	
	public Train(String name) {
		this.speed = MIN_SPD;
		this.gas = TRAIN_MAX_GAS;
		this.name = name;
	}
	// 오버라이드 해서 사용해야하는 구현메서드
	@Override
	public void accel() {
		// 속도제한은 300이며 가속할 경우 50씩 증가
		// 연료는 7씩 감소
		if(this.speed + TRAIN_INCREASE_SPD > TRAIN_MAX_SPD) {
			this.speed = TRAIN_MAX_SPD;
		}else {
			this.speed += TRAIN_INCREASE_SPD;
		}
		if(this.gas - TRAIN_DECREASE_GAS < MIN_GAS) {
			this.gas = MIN_GAS;
		}else {
			this.gas -= TRAIN_DECREASE_GAS;
		}
	}
	@Override
	public void breakSpeed() {
		// 감속할 경우 50씩 감소합니다.
		// 최소 감속은 0입니다.
		if(this.speed - TRAIN_DECREASE_SPD < MIN_SPD) {
			this.speed = MIN_SPD;
		}else {
			this.speed -= TRAIN_DECREASE_SPD;
		}
	}
	@Override
	public void reFuel() {
		// 연료는 70씩 충전됩니다.
		// 최대치는 MAX_GAS를 초과할 수 없습니다.
		if(this.gas + TRAIN_INCREASE_GAS > TRAIN_MAX_GAS) {
			this.gas = TRAIN_MAX_GAS;
		}else {
			this.gas += TRAIN_INCREASE_GAS;
		}
	}
	@Override
	public void showStatus() {
		// 기차의 정보를 조회
		System.out.println("현재속도 : " + this.speed + ", 현재 연료량 : " + this.gas + 
		           ", 기관사명 : " + this.name);
		System.out.println("--------------------------");	
	}
}

package interface1;

// 인터페이스는 interface 선언을 사용합니다
// 내부에는 상수인 값과 추상메서드만 선언할 수 있습니다.
// 애초에 구현(implements)을 전제로 설계되기 때문에
// 일반 변수, 메서드를 내부에 선언할 수 없습니다.
// 다형성에는 부모클래스의 역할을 합니다.
public interface Vehicle {
	// 최대 연료량
	// 바로 상수로 잡힙니다.
	int MIN_SPD = 0;// 공용 최저 속도
	int MIN_GAS = 0;//공용 최저 연료
	// 순서대로 자동차의 최대속도, 최대 연료량, 연료 증가량, 연료 감소량, 속도 증가량, 속도 감소량
	int CAR_MAX_SPD = 200;
	int CAR_MAX_GAS = 100;
	int CAR_INCREASE_GAS = 30;
	int CAR_DECREASE_GAS = 1;
	int CAR_INCREASE_SPD = 10;
	int CAR_DECREASE_SPD = 10;
	// 순서대로 기차의 최대속도, 최대 연료량, 연료 증가량, 연료 감소량, 속도 증가량, 속도 감소량
	int TRAIN_MAX_SPD = 300;
	int TRAIN_MAX_GAS = 150;
	int TRAIN_INCREASE_GAS = 70;
	int TRAIN_DECREASE_GAS = 20;
	int TRAIN_INCREASE_SPD = 50;
	int TRAIN_DECREASE_SPD = 40;
	// 순서대로 비행기의 최대속도, 최대 연료량, 연료 증가량, 연료 감소량, 속도 증가량, 속도 감소량
	int AIRPLANE_MAX_SPD = 900;
	int AIRPLANE_MAX_GAS = 1000;
	int AIRPLANE_INCREASE_GAS = 500;
	int AIRPLANE_DECREASE_GAS = 150;
	int AIRPLANE_INCREASE_SPD = 400;
	int AIRPLANE_DECREASE_SPD = 300;
	// 탈 것이라면 가지고 있을 공통적 기능을 전부 추상메서드로 작성
	// {
	//    실행문...
	// }
	// 와 같은 실행문부분(메서드의 body)없이 선언만 해 주세요.
	public void accel();// 가속
	public void breakSpeed();// 감속
	public void reFuel();// 주유
	public void showStatus();// 계기판 조회

}

package final1;

public class FinalMain02P278 {

	public static void main(String[] args) {
		// 일반 숫자를 이용한 출력요소
		System.out.println("전사의 체력 : " + 50);
		System.out.println(50);
		System.out.println("몬스터의 경험치 : " + 20);
		System.out.println(20); // 설명이 없으면 다른사람이 볼때 무슨 값인지 모름
		
		// 자주  사용하게될 고정값은 아래와 같이 상수 처리해서
		// 코드에 대입을 해줍니다.
		// 이러면 변수명만으로도 어떤 의미를 가진 상수인지
		// 바로 유추가 가능하기 때문에 코드 가독성이 높아집니다.
		// 상수는 대문자로만 적으며 단어사이는 _로 연결합니다.
		final int WORRIOR_HP = 50;
		final int MONSTER_EXP = 20;
		
		System.out.println(WORRIOR_HP);
		System.out.println(MONSTER_EXP);
		// 상수를 굳이 쓰는 2번째 이유는 아래와 같이 바꾸려는 값이 많을 때
		// 값을 일괄적으로 바꾸기 편하기 때문입니다.
		System.out.println(WORRIOR_HP);
		System.out.println(MONSTER_EXP);
		System.out.println(WORRIOR_HP);
		System.out.println(MONSTER_EXP);
		System.out.println(WORRIOR_HP);
		System.out.println(MONSTER_EXP);
	}
}
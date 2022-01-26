package math1;

public class Math04 {

	public static void main(String[] args) {
		// Math.rendom()은 0이상 1미만인 난수를 구해줍니다.
		double a = Math.random();
		System.out.println(a);
		
		// 게임에서 강화를 예제로 들어보겠습니다.
		// 15% 확률로 강화 성공
		for(int i = 0; i < 10; i++) {
			if(Math.random() < 0.15) {
			System.out.println("강화에 성공했습니다.");
			}else {
			System.out.println("강화에 실패했습니다.");
			}
		}
		// 범위를 제한하고 싶은 경우(0이상 6미만)
		int b = (int)(Math.random() * 6);
		System.out.println(b);
	}
}
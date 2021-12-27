package math1;

public class Math06 {

	public static void main(String[] args) {
		// 가위바위보 게임을 만들어보겠습니다.
		// Math.random()을 이용해 1/3 확률로 가위, 바위, 보를 부여받으며
		// 가위 > 보, 바위 > 가위, 보 > 바위의 상성을 가집니다.
		// 같은 요소가 나오면 무승부입니다.
		// 가위 바위 보를 뽑는 부분부터 작성해주세요.
		// 0 = 가위, 1 = 바위, 2 = 보
		int myValue = (int)(Math.random() * 3);
		int comValue = (int)(Math.random() * 3);

		// 상수를 처리하는 부분
		final int SCISSORS = 0;
		final int ROCK = 1;
		final int PAPER = 2;
		
		
		if((myValue == SCISSORS && comValue == PAPER) ||
			(myValue == ROCK && comValue == SCISSORS) ||
			(myValue == PAPER && comValue == ROCK)) {
			System.out.println("내가 이겼습니다.");
		}else if((myValue == SCISSORS && comValue == ROCK)||
				(myValue == ROCK && comValue == PAPER) ||
				(myValue == PAPER && comValue == SCISSORS)) {
			System.out.println("컴퓨터가 이겼습니다.");
		}else if(myValue == comValue) {
			System.out.println("무승부입니다.");
		}
		
		// 내가 낸 것과 컴퓨터가 낸 것을 숫자에서 문자로 치환해주는 배열
		String[] items = {"가위", "바위", "보"};
		
		// 내가 낸 것과 컴퓨터가 낸 것을 출력해주는 부분
		System.out.println("내가 낸 것 : " + items[myValue]);
		System.out.println("컴퓨터가 낸 것 : " + items[comValue]);
		
		
		
		
		
		/*String s = "가위";
		String r = "바위";
		String p = "보";
		final int SCISSORS = 0;
		final int ROCK = 1;
		final int PAPER = 2;
		if(myValue == SCISSORS && comValue == SCISSORS) {
			System.out.println("무승부");
			System.out.println("내가 낸 것 : " + s);
			System.out.println("컴퓨터가 낸 것 : " + s);
		}else if(myValue == SCISSORS && comValue == ROCK) {
			System.out.println("컴퓨터가 이겼습니다.");
			System.out.println("내가 낸 것 : " + s);
			System.out.println("컴퓨터가 낸 것 : " + r);
		}else if(myValue == SCISSORS && comValue == PAPER) {
			System.out.println("내가 이겼습니다.");
			System.out.println("내가 낸 것 : " + s);
			System.out.println("컴퓨터가 낸 것 : " + p);
		}else if(myValue == ROCK && comValue == ROCK) {
			System.out.println("무승부");
			System.out.println("내가 낸 것 : " + r);
			System.out.println("컴퓨터가 낸 것 : " + r);
		}else if(myValue == ROCK && comValue == SCISSORS) {
			System.out.println("내가 이겼습니다.");
			System.out.println("내가 낸 것 : " + r);
			System.out.println("컴퓨터가 낸 것 : " + s);
		}else if(myValue == ROCK && comValue == PAPER) {
			System.out.println("컴퓨터가 이겼습니다.");
			System.out.println("내가 낸 것 : " + r);
			System.out.println("컴퓨터가 낸 것 : " + p);
		}else if(myValue == PAPER && comValue == PAPER) {
			System.out.println("무승부");
			System.out.println("내가 낸 것 : " + p);
			System.out.println("컴퓨터가 낸 것 : " + p);
		}else if(myValue == PAPER && comValue == SCISSORS) {
			System.out.println("컴퓨터가 이겼습니다.");
			System.out.println("내가 낸 것 : " + p);
			System.out.println("컴퓨터가 낸 것 : " + s);
		}else if(myValue == PAPER && comValue == ROCK) {
			System.out.println("내가 이겼습니다.");
			System.out.println("내가 낸 것 : " + p);
			System.out.println("컴퓨터가 낸 것 : " + r);
		}/*else if(myValue == comValue) {
			System.out.println("비겼습니다.");
		}*/
	}

}

package exception3;

public class Throws01P361 {

	public static void doIt(String[] s, int i) throws ArrayIndexOutOfBoundsException{
	// 내부가 인덱스 조회이므로, 언제든 ArrayIndexOutOfBoundsException 발생이 가능함
	System.out.println(s[i]);
	}
	public static void main(String[] args) {
		// 특정 메서드 영역에서 발생하는 코드는 엄밀히 말하면 try블럭 외부의
		// 예외 발생으로 간주됩니다.
		// 따라서 개념적으로는 try블럭 밖에 있지만 실제로는 try블럭에 속한것처럼
		// 처리하기 위해 throws를 사용자 정의 메서드 뒤에 붙여줍니다.
		String[] greetings = {"안녕", "hi", "니하오", "싸왓디"}; //인덱스 번호 0, 1, 2, 3
		int i = (int)(Math.random() * 5); // 정수 0, 1, 2, 3, 4
		
		try {
			doIt(greetings, i);
		}catch(Exception e) {// i가 4가 나오면 예외처리를 해줌
			System.out.println("main지역에서 처리했습니다.");// throws로 인해 doIt지역에서 
			// 실행 된게 아닌 main지역에 있는 try로 넘겨 받았기 때문에 main지역에서 처리되었다고 표시
		}
	}
}
package exception2;

public class TryCatch02P353 {

	public static void main(String[] args) {
		// 아까 exception1 패키지 내부의 여러 예외 유형 중
		// 하나를 골라서 예외가 발생할 수 있는 코드를 작성해주세요.
		// 발생할 예외에 대한 처리는 try~catch블록을 활용합니다.
		// / by zero(0으로 나누기)에 대한 처리는 허용하지 않습니다.
		int[] arr = new int[5];
		
		try {
			/*for(int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}*/
			for(int value : arr) {// 향상된 for문은 절대 인덱스를 오버 할 수 없음
				System.out.println(value);
			}
			System.out.println(arr[5]);
		}catch(Exception e) {
			System.out.println("데이터가 없습니다.");
		}finally {
			System.out.println("코드 끝!");
		}

	}

}

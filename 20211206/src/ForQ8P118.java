
public class ForQ8P118 {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		// 아래와 같은 별을 찍을 수 있도록 코드를 작성해주세요.
		//    *
		//   **
		//  ***
		// ****
		// 중첩 반복문의 어느곳이 세로, 가로를 담당하는지 생각해보세요.
		// 힌트 : 띄어쓰기를 3/2/1개순으로 적는 반복문 하나와
		//       *을 1/2/3/4개순으로 적는 반복문 하나 해서
		//       i반복문내부에 j,k 총 2개의 반복문이 추가로 돕니다.
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4-i-1/*3-i라고 써도 무방*/; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
			//for(int k = i+1; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

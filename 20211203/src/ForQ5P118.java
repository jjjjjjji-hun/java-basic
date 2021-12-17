import java.util.Scanner;

public class ForQ5P118 {

	public static void main(String[] args) {
		// Scanner로 정수를 입력받게 해 주세요.
		// 입력받은 정수의 제곱 형태의 직사각형이 찍히도록
		// 중첩 반복문을 작성해주세요.
		// 3 입력시
		// ***
		// ***
		// *** 과 같이 출력
		// 가로줄 출력시 System.out.print("*");을
		// 다음줄로 내릴 때만 System.out.println();을 씁니다.
		Scanner scan = new Scanner(System.in);
		System.out.println("한 변의 너비를 입력해주세요.");
		int i = scan.nextInt();

		for(int b = 1; b <= i; b++) {
			for(int a = 1; a <= i; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}

}

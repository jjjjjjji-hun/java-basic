import java.util.Arrays;

public class EnhancedFor01P162 {

	public static void main(String[] args) {
		// 향상된 for문은 반복문 진행시 타겟으로 배열을 넣습니다.
		// 이 경우 반복실행 횟수는 배열의 내부요소 갯수만큼입니다.
		
		// 7개의 요소를 묶어서 arr1에 저장
		int[] arr1 = {100, 211, 339, 475, 591, 600, 700};
		// arr1[순번] 을 입력해서 내부 요소를 하나만 꺼낼 수 있음(순번은 0부터 시작)
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1[3]);
		// for(하나씩 받을 변수 : 배열){
		//     실행문....;
		// }
		
		// 배열 길이는 배열명.length로 확인할 수 있다.
		System.out.println("배열 내부 요소 갯수");
	    System.out.println(arr1.length);
	    
		for(int item: arr1) {
			System.out.println(item);
		}
		////향상된 for문 이전 //////
		// 배열명.length는 내부 요소의 갯수를 대신해 쓸 수 있습니다.
		//for(int i = 0; i < 7 (arr1.length); i++ ) {
			//System.out.println(arr1[i]);
		// }
		/*int[] arr2 = {1, 33, 555, 7777, 9999};
		for(int s: arr2) {
			System.out.println(s);
		}*/
		}

}


package arrays1;

import java.util.Arrays;

public class Arrays06 {

	public static void main(String[] args) {
		// 유니코드를 활용하는 모든 문자
		String[] arr = {"김자바", "😂😂😂😂", "こんにちは", "阿"};
		// 정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}

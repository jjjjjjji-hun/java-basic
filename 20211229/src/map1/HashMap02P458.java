package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap02P458 {

	public static void main(String[] args) {
		// 식당 메뉴판을 만들어보세요.
		// Key는 음식이름, Value는 가격(정수)로 저장해주세요.
		// 메뉴는 5개 이상 넣어주세요.
		// 메뉴를 3개 조회해서 화면에 출력해주세요.
		Map<String, Integer> food = new HashMap<>();
		food.put("왕돈까스", 8000);
		food.put("치즈돈까스", 9000);
		food.put("안심+등심까스", 10000);
		food.put("냉모밀", 3000);
		food.put("우동", 3000);

		System.out.println(food.get("왕돈까스"));
		System.out.println(food.get("치즈돈까스"));
		System.out.println(food.get("냉모밀"));
	}

}

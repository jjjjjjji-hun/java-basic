package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap01P458 {

	public static void main(String[] args) {
		// Map 인터페이스의 대표 구현체는 HashMap입니다.
		// 제네릭 내부에는 <Key자료형, Value자료형> 으로 작성합니다.
		Map<String, String> map = new HashMap<>();
		//        Key    Value
		map.put("김자바", "자바");
		map.put("코로나", "백신");
		map.put("김개발", "JSP");
		System.out.println(map);
		// 주어진 키가 있는지 조회 할 때는 .containsKey(Key값) 으로 조회합니다.
		// 주어진 키가 있는지 조회 할 때는 .containsValue(Value값) 으로 조회합니다.
		System.out.println(map.containsKey("김자바"));
		System.out.println(map.containsValue("김자바"));
		// 자료조회시는 .get(Key값) 으로 조회합니다.
		// map은 Key로 Value를 조회하는건 가능하지만 역으로 Value로 Key를 조회하는건 불가능합니다.
		// 없는 키값으로 조회하면 null이 나옵니다.
		// 인덱스번호도 없습니다.
		System.out.println(map.get("김자바"));
		System.out.println(map.get("자바"));
		
		// remove는 Key를 이용해서 Key = Value 전체를 삭제합니다.
		map.remove("코로나");
		System.out.println(map);
		// .size()는 크기를 알려줍니다. 정수로  몇 개의 Key = Value 쌍이
		// 저장되어있는지 확인 할 수 있습니다.
		System.out.println(map.size());
		System.out.println(map.values());
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
	}
}
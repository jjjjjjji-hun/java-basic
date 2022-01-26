package stringbuilder1;

public class Builder08P408 {

	public static void main(String[] args) {
		// reverse()는 문자열을 인덱스 순으로 따졌을떄
		// 역순으로 나열해줍니다.
		
		StringBuilder str = new StringBuilder("안녕하세요 김자바입니다.");
		
		str.reverse();
		
		System.out.println(str);
	}
}
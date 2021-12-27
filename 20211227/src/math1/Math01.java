package math1;

public class Math01 {

	public static void main(String[] args) {
		// Math는 자바에서 이미 기본으로 제공하는 기능이라
		// import 없이 사용가능합니다.
		
		int a = -1024; // 절댓값을 구함
		System.out.println(Math.abs(a));
		
		double b = 3.14; // 올림값을 구함
		System.out.println(Math.ceil(b));
		
		double c = 19.9; // 내림값을 구함
		System.out.println(Math.floor(c));

	}

}

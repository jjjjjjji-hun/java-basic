package overloading;

public class Parttimer {
	// 파트타이머의 정보
	// 오전여부, 시급, 가게명, 본인이름
	private boolean afternoon;//true면 오후, 아니면 오전
	private int pay;// 시급
	private String shopName;// 가게명
	private String name;// 본인이름
	
	// 생성자 오버로딩은, 생성자를 여러 개 오버로딩 형식으로 만드는 것입니다.
	public Parttimer(boolean a, int p, String s, String n) {
		// p에 최저시급보다 적은 금액이 들어올 경우
		// 최저시급으로 강제로 보정하는 로직을 추가해주세요.
		if(p < 8720) { // 위의 조건을 먼저 검사해주기 위해 조건식 생성
			p = 8720;
		}//else {pay = p;} 도 가능
		afternoon = a;
		pay = p;
		shopName = s;
		name = n;
		System.out.println("알바가 생성되었습니다.");
		System.out.println("오후알바 : " + afternoon);
		System.out.println("시급 : " + pay);
		System.out.println("가게명 : " + shopName);
		System.out.println("알바생 명 : " + name);
	}
	// 오버로딩은 이름은 같은데 파라미터값의 종류나 개수가 다르면 중복 작성을 허용합니다.
	// afternoon, shopName, name만 입력받는 생성자를 하나 더 중복작성
	// pay는 최저시급
	public Parttimer(boolean a, String s, String n) {
		afternoon = a;
		pay = 8720;
		shopName = s;
		name = n;
		System.out.println("알바가 생성되었습니다.");
		System.out.println("오후알바 : " + afternoon);
		System.out.println("시급 : " + pay);
		System.out.println("가게명 : " + shopName);
		System.out.println("알바생 명 : " + name);
	}
}
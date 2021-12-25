package static2;

public class Main01P276 {

	public static void main(String[] args) {
		// Asean 조원 생성 없이도 팀 점수는 public으로 처리된 경우 바로 조회 가능
		// System.out.println(Asean.presentationScore);
		// private으로 처리된 경우 static메서드를 이용해서 조회 가능
		Asean.showPre();
		// 출석 : 10%, 중간고사 : 35%, 기말고사 : 35%, 발표 : 20%
		Asean a = new Asean(8, 30, 29);
		Asean b = new Asean(10, 20, 34);
		Asean c = new Asean(5, 15, 20);
		Asean d = new Asean(10, 35, 34);		

		a.showAseanInfo();
		b.showAseanInfo();
		c.showAseanInfo();
		d.showAseanInfo();
	}

}

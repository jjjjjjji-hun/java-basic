package constructor;

public class Main03P204 {

	public static void main(String[] args) {
		Webtoon a = new Webtoon("외모지상주의", "박태준", 9.4);
		a.getInfo();
		a.uploadWebtoon();
		a.uploadWebtoon();
		a.completeWebtoon();
		a.getInfo();
		
		Webtoon b = new Webtoon("프리드로우", "전선욱", 9.8);
		b.getInfo();
		b.uploadWebtoon();
		b.uploadWebtoon();
		b.uploadWebtoon();
		b.completeWebtoon();
		b.getInfo();
		

	}

}

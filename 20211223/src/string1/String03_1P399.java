package string1;

public class String03_1P399 {

	public static void main(String[] args) {
		String a = "qwertyuioplkqwejhgfdsazxqwecvbnm";
		String b = "qwe";
		
		int count = 0;
		boolean bool = true;
		int fidx = -1;
		while(bool) {
			int get = a.indexOf(b, fidx + 1);
			if(get == -1) {
				bool = false;
			}else {
				fidx = get;
				count++;
				System.out.println(get + "번에서" + count + "번째" + 
		                   b + "이(가) 검출되었습니다.");
			}
		}
		System.out.println(b + "의 총 출현 횟수는" + count + "회입니다.");
	}

}

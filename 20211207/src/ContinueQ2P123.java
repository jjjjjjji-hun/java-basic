
public class ContinueQ2P123 {

	public static void main(String[] args) {
		// 다음은 학생들의 과목별 성적입니다.
		// math = 96, 23, 52, 82, 72, 31, 58
		// eng = 62, 42, 68, 31, 80, 77, 45
		// com = 10, 28, 39, 74, 65, 90, 98
		// 각 과목별 평균점수를 내주시되, 합격자 평균만 내주세요.
		// 합격점수는 60점입니다.
		int[] math = {96, 23, 52, 82, 72, 31, 58};
		int[] eng = {62, 42, 68, 31, 80, 77, 45};
		int[] com = {10, 28, 39, 74, 65, 90, 98};
		
		int total = 0;
		int count = 0;
		
		for(int a: math) {
			if(a < 60) {
				continue;
			}else { // 생략가능
			count += 1;
			total += a;
		  }
		}
		System.out.println("수학합격자 평균은 " + total/count + "입니다.");
		
		total = 0;
		count = 0;
		
		for(int a: eng) {
			if(a < 60) {
				continue;
			}
			count += 1;
			total += a;
		}
		System.out.println("영어합격자 평균은 " + total/count + "입니다.");
		
		for(int a: com) {
			if(a < 60) {
				continue;
			}
			count += 1;
			total += a;
		}
		System.out.println("컴퓨터합격자 평균은 " + total/count + "입니다.");
	}

}

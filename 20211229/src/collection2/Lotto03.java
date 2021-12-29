package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto03 {

	public static void main(String[] args) {
		// 로또복권 당첨 시뮬레이터를 만들어주세요.
		// 1. 당첨번호 6개를 뽑습니다.
		// 2. 추첨번호 6개를 뽑습니다.
		// 3. 당첨번호와 추첨번호를 비교해서 일치하면 반복 중지
		// 4. 3에서 일치하지 않으면 반복회수를 1 더하고 다시 추첨번호 6개를 뽑고
		// 이어서 비교해서 일치여부 검사.
		List<Integer> lotto = new ArrayList<>();
		int getNum = 0;
		while(lotto.size() != 6) {
			getNum = (int)(Math.random() * 45 + 1);
			if(!lotto.contains(getNum)) {
				lotto.add(getNum);
			}
		}
			Collections.sort(lotto);
			System.out.println("당첨 번호 : " + lotto);
			List<Integer> lotto2 = new ArrayList<>();
			int getNum2 = 0;
			int count = 0;
			while(!lotto.equals(lotto2)) {
				lotto2.clear();
				while(lotto2.size() != 6) {
					getNum2 = (int)(Math.random() * 45 + 1);
						if(!lotto2.contains(getNum2)) {
							lotto2.add(getNum2);
					}
				}
						Collections.sort(lotto2);
						System.out.println("내가 뽑은 행운 번호 : " + lotto2);
						System.out.println("로또 당첨 여부 : " + lotto.equals(lotto2));
						count++;
			}
				System.out.println("로또 구매한 횟수 : " + count);
	}
}

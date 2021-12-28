package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto01 {

	public static void main(String[] args) {
		// 로또복권 추첨기를 만들어보겠습니다.
		// 로또복권 추첨기는 1~45범위에서 겹치는 숫자 없이
		// 6개의 숫자를 뽑습니다.
		// 순서를 정렬해서 콘솔에 찍어주도록 만들어주세요.
		// ArryList의 정렬은 .sort()대신
		// Collections.sort(ArrayList)를 사용합니다.
		List <Integer> lotto = new ArrayList<>();
		Random random = new Random();
		int num = 0;
		while(lotto.size() < 6) {
			num = (random.nextInt(45)+1);
			if(lotto.contains(num)) {
				continue;
			}else{
				lotto.add(num);
			}
		}
		int num2 = 0;
		int second = 0;
		while(true) {
		num2 = (random.nextInt(45)+1);
		if(lotto.contains(num2)) {
			continue;
		}else {
			second = num2;
			break;
		 }
		}
		Collections.sort(lotto);
		System.out.println("추첨된 번호 : " + lotto);
		System.out.println("2등 당첨 번호 : " + second);
}
}
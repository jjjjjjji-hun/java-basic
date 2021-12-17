
public class P86Q3_2 {

	public static void main(String[] args) {
		// su01 이 su02 보다 크면 su01에 sus02 값을 누적 시켜 res변수에 누적된 값을 리턴하고 그렇지 않으면 su02 값을
		// 리턴하여 출력하는 코드를 밑줄을 채워 실행 결과와 나올 수 있도록 구현하시오.
		
		int su01 = 5;
		int su02 = 4;
		
		int res = (su01 > su02) ? su01 + su02 : su02;
		System.out.println("res= " + res);

	}

}


public class System_out_print {

	public static void main(String[] args) {
		// ﻿콘솔창에 특정 데이터를 출력하는 메서드입니다.
		// System.out.print(); 는 콘솔에 데이터를 출력만 해주고
		// System.out.println(); 는 콘솔에 데이터를 출력한 후 줄바꿈 까지 해줍니다.
		
		System.out.print("콘솔에 찍힙니다.");
		System.out.print("줄바꿈이 되지 않습니다.");
		System.out.println(); // ()안에 아무내용을 적지 않으면 줄바꿈만 실행합니다.
		System.out.println("마찬가지로 콘솔에 찍히고");
		System.out.println("줄바꿈 까지 실행해줍니다.");
	}
}
package p2021_12_23;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {

//	switch~case문
//
//	    switch(변수){
//
//			case 값1: 실행될 문장;
//				break;
//			case 값2: 실행될 문장;
//				break; 
//			default: 위의 case를 만족하지 않을때
//		         	   실행될 문장;
//	     }

		// 키보드로 입력한 점수가 어느 학점에 해당하는지 판별하는 프로그램을 작성하세요?

		// 90점 이상 - A학점
		// 80점 이상 - B학점
		// 70점 이상 - C학점
		// 60점 이상 - D학점
		// 60점 미만 - F학점

		// int형과 int형을 산술연산 연산을 수행하면 int형으로 처리된다.
		System.out.println("0~100점 사이의 점수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();

		switch (s / 10) {
		case 10:
			System.out.println("A+학점");
			break;
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default:
			System.out.println("F학점");
		}
	}

}

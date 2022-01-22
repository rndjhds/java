package homework;

import java.util.Scanner;

public class problem {

	public static void main(String[] args) {

//			키보드를 이용해서 입력한 정수의 팩토리얼을
//			   구하는 프로그램을 작성 하세요?
//				ex) 3! = 3 * 2 * 1
//		        	5! = 5 * 4 * 3 * 2 * 1

		System.out.println("1개의 정수를 입력하세요.");
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int a = 1;
		for (int i = 0; i < num1; i++) {
			a *= (num1 - i);
		}
		System.out.println(a);

	}

}

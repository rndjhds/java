package p2021_12_27;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		
		System.out.println("메세지를 입력 하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요?");
		
		Scanner sc = new Scanner(System.in);
		String input;
		
		do {
			System.out.println(">");
			input = sc.nextLine();	// 입력한 1줄을 입력받는다.
			System.out.println("입력문자:"+input);
		}while(!input.equals("q"));	// 조건식 : input변수에 저장된 값이 q가 아니면 true
									// 사용자가 q를 입력하면 조건식이 false가 되어서 반복문을 빠져 나온다.
		System.out.println("프로그램 종료");
		sc.close();
	}

}

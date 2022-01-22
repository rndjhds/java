package p2022_01_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {

	public static void main(String[] args) {

//		키보드로 구구단 1개단을 입력 받아서, 구구단 1개 단을 출력하는 
//		프로그램을 작성 하세요?
		
		System.out.println("원하는 단을 입력하세요?");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String input = br.readLine();	// input은 try의 지역변수  String input = "5";
			int dan = Integer.parseInt(input);	// int dan = 5;		// 예외발생
			
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan +"*" + i + "=" + (dan * i));
			}
			
		} catch (Exception e) {
			System.out.println("숫자만 입력 하세요.");
			e.printStackTrace();
		}
	}

}

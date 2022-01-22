package homework;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("년도를 입력하세요");
			int year = sc.nextInt();
			System.out.println();

			if (year % 400 == 0) {
				System.out.println(year + "년은 윤년입니다.");
			} else if (year % 100 == 0) {
				System.out.println(year + "년은 평년입니다.");
				break;
			} else if (year % 4 == 0) {
				System.out.println(year + "년은 윤년입니다.");
			} else {
				System.out.println(year + "년은 평년입니다.");
				break;
			}
		}
	}

}

package homework;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class LeapYearEx {

	public static void main(String[] args) {
		
		System.out.print("년도를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();	// 연도
		
		GregorianCalendar gc = new GregorianCalendar();
		if(gc.isLeapYear(year)) {
			System.out.println(year+"윤년");
		}else {
			System.out.println(year+"평년");
		}
		
	}

}

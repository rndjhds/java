package homework;

import java.util.Scanner;

public class test {

	 static void ckeck(String jumin) {
		int total = 0;
		int[] num = new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
		for (int i = 0; i < jumin.length() - 1; i++) {
			total += Integer.parseInt(jumin.substring(i, i + 1)) * num[i];
		}
		int na = total % 11;
		
		int a = 11 -na;
		if(a >= 10) {
			a %= 10;
			if(a == Integer.parseInt(jumin.substring(12, 13))) {
				System.out.println("맞는 주민번호입니다");
			}else {
				System.out.println("틀린 주민번호입니다.");
			}
		}else {
			if(a == Integer.parseInt(jumin.substring(12, 13))) {
				System.out.println("틀린 주민번호입니다");
			}else {
				System.out.println("틀린 주민번호입니다.");
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String jumin1 = sc.nextLine();
		String jumin2 = sc.nextLine();

		if (jumin1.length() != 6) {
			System.out.println("6자리를 입력해주세요");
		} else if (jumin2.length() != 7) {
			System.out.println("7자리를 입력해주세요");
		}
		test.ckeck(jumin1 + jumin2);
	}

}

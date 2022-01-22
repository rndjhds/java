package homework;

import java.util.Scanner;

public class Oper {

	public static void main(String[] args) {
		
		System.out.println("정수를 3개 입력하세요?");
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int middleMax = (num1 > num2) ? num1 : num2;
		int middleMin = (num1 < num2) ? num1 : num2;
		int max = (middleMax > num3) ? middleMax : num3;
		int min = (middleMin < num3) ? middleMin : num3;
		
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		
		
	}

}

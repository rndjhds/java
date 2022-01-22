package homework;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {

		int[] score = new int[5];
		int max, min;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		max = score[0];
		min = score[0];
		for(int j = 1; j < score.length; j++) {
			if(max < score[j])
				max = score[j];
			if(min > score[j])
				min = score[j];
		}
		System.out.println("max:"+max);
		System.out.println("min:"+min);
	}

}

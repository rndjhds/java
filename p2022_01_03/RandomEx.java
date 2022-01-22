package p2022_01_03;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {

// 난수 발생 방법 :	1. Math.random()
//				2. Random 클래스
		
		Random r = new Random();
		int n1 = r.nextInt(10);	// 0 ~ 9
		System.out.println("n1="+n1);
		
		// 1 ~ 45 사이의 난수 발생
		int n2 = r.nextInt(45) + 1;
		System.out.println("n2="+n2);
		
		int n5 = r.nextInt();
		System.out.println("n5="+n5);
		
		// 1 ~ 45 사이의 난수 6개 발생
		for(int i = 1; i <= 6; i++) {	// 배열이 아니기 때문에 length사용 불가능
			int n3 = r.nextInt(45) + 1;
			System.out.print(n3+"\t");
		}
		System.out.println();
		
		// 0.0 <= Math.random() < 1.0
		int n4 = (int)(Math.random() * 45) + 1;
		System.out.println("n4="+n4);
		
		
	}

}

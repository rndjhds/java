package p2021_12_28;

public class ArrayEx01 {

	public static void main(String[] args) {

// 배열 : 동일한 자료형의 데이터를 저장하기 위한 정적인 자료구조
// 변수 -> 배열  -> 자료구조(List)

// 1차원 배열 첫번째 형식 : 배열에 저장될 값이 정해져 있지 않는 경우에 주로 사용
		int[] 	score = new 	int[3];
// 		자료형	배열변수 	연산자	자료형[배열의 크기]
		
		// int형 배열은 자동으로 0으로 초기화가 된다.
		System.out.println(score[0]);	// 0
		System.out.println(score[1]);	// 0
		System.out.println(score[2]);	// 0
		
		score[0] = 80;	// 0번 방에 80점을 할당
		score[1] = 90;	// 1번 방에 90점을 할당
		score[2] = 100;	// 2번 방에 100점을 할당
		
		System.out.println(score[0]);	
		System.out.println(score[1]);	
		System.out.println(score[2]);	
		
		// double 배열은 자동으로 0.0으로 초기화 된다.
		double[] d = new double[3];
		System.out.println(d[0]);	// 0.0
		System.out.println(d[1]);	// 0.0
		System.out.println(d[2]);	// 0.0
		
		// char 배열은 자동으로 초기화가 되지 않는다.
		char[] c = new char[3];
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		
		// boolean 배열은 자동으로 false로 초기화가 된다.
		boolean[] b = new boolean[3];
		System.out.println(b[0]);	// false
		System.out.println(b[1]);	// false
		System.out.println(b[2]);	// false
		
		String[] str = new String[3];
		System.out.println(str[0]);	// null : 값이 없다는 의미
		System.out.println(str[1]);	// null
		System.out.println(str[2]);	// null
		
		str[0] = "자바";
		str[1] = "오라클";
		str[2] = "스프링";
		
		System.out.println(str[0]);	// 자바
		System.out.println(str[1]);	// 오라클
		System.out.println(str[2]);	// 스프링
		
		
// 1차원 배열 두번째 형식 : 배열 선언과 동시에 초기화를 할때 주로 사용
//					배열에 할당된 값이 정해져 있는 경우에 주로 사용
		int[] s1 = {80, 90, 100};
		int[] s2 = new int[] {80, 90, 100};
		System.out.println(s1[0]);	// 80
		System.out.println(s1[1]);	// 90
		System.out.println(s1[2]);	// 100
		System.out.println(s2[0]);	// 80
		System.out.println(s2[1]);	// 90
		System.out.println(s2[2]);	// 100
		System.out.println("배열의 크기:"+s1.length);	// 배열의 크기:3
		for(int i = 0; i < s1.length; i++) {
			System.out.print(s1[i]+"\t");
		}
		System.out.println();
		
		double[] dd = {3.14, 10.5, 42.195, 50};
		for(int i = 0; i < dd.length; i++) {
			System.out.print(dd[i]+"\t");
		}
		System.out.println();
		
		char[] cc = {'j', 'a', 'v', 'a', '자', '바'};
		for(int i = 0; i < cc.length; i++) {
			System.out.print(cc[i]+"\t");
		}
		System.out.println();
		
		boolean[] bb = {true, false, true};
		for(int i = 0; i < bb.length; i++) {
			System.out.print(bb[i]+"\t");
		}
		System.out.println();
		
		String[] str1 = {"자바", "오라클", "스프링", "파이썬", "텐스플로우"};
		String[] str2 = new String[] {"자바", "오라클", "스프링", "파이썬", "텐스플로우"};
		for(int i = 0; i < str1.length; i++) {
			System.out.print(str1[i]+"\t");
		}
		System.out.println();
		
	}

}

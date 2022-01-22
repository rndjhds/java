package p2021_12_27;

public class For02 {

	public static void main(String[] args) {

//	1 ~ 10 까지  합을 구하는 프로그램을 작성하세요?

		int sum = 0;	// 지역 변수(local variable) : main()메소드 안에서만 사용가능
		for(int i = 1; i <= 10; i++) {	// 지역 변수(local variable) : for문 안에서만 사용가능 
			sum += i;	// sum = sum + i;
			
			System.out.println("1~"+i+"="+sum);
		}
//		System.out.println(i);	// 오류발생(지역변수이기 때문에)
		System.out.println("sum="+sum);
	}
	
}
// 지역변수의 조건 : 블록문안에있는 변수
//				매개변수
//				메소드 안에 있는 변수
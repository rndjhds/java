package p2022_01_11;

public class DivideZeroExceptionHandling2 {
	public static void main(String[] args) {

		// int type의 변수 선언
		int b = 20;
		int a = 0;
		int c = 0;

		// 두 수의 나눗셈 결과를 구한다
		try {
			c = b / a;	// 예외발생
			int total = a + b;
			int sub = b - a;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("0을 나눌수 없습니다.");
			
			// java.lang.Throwable의 메소드
			// 예외 정보를 자세히 출력
			e.printStackTrace();	// 출력 기능을 내장하고 있음
//			System.out.println(e.printStackTrace()); //오류 발생 : 자료형이 void이다.

			// 예외 정보를 문자열로 반환함.
			System.out.println(e.getMessage());

			// 예외의 간단한 설명문을 반환함.
			System.out.println(e.toString());
		}
	}// main end
}

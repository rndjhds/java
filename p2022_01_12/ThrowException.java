package p2022_01_12;

public class ThrowException {

	public void exceptionMethod() throws ArrayIndexOutOfBoundsException {
		// 배열 선언
		int[] intA = { 1, 2, 3, 4 };

		// 배열의 저장된 값을 출력
		for (int i = 0; i < 10; i++) {
			// 예외를 던짐(프로그래머가 예외를 발생시킴)
			if (i == 4) // i == 4일때 강제로 예외를 발생시킴
				throw new ArrayIndexOutOfBoundsException();	// 강제로 예외를 발생시키는 방법
			System.out.println(intA[i]);	// 1, 2, 3, 4
		}
	}

	public static void main(String[] args) {
		ThrowException te = new ThrowException();

		try {
			te.exceptionMethod();
		} catch (ArrayIndexOutOfBoundsException ab) {
			System.out.println("배열의 index를 초과했습니다.");
			ab.printStackTrace();
		}

	}// main() end
}


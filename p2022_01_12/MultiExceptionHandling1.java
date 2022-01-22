package p2022_01_12;

// try ~ catch ~ finally
// finally 안에 들어있는 내용은 예외가 발생하든, 발생하지 않든 무조건 
// 실행된다.

public class MultiExceptionHandling1 {
	public static void main(String[] args) {

		int value = 20;
		int div = 0;

		int[] intArray = { 1, 2, 3 };
//		intArray[0] = 1, intArray[1] = 2, intArray[2] = 3

		try {	// 예외가 발생시 발생문장 아래는 실행하지 않는다.
			// 두수의 나눗셈을 구함
//	    int result = value / div;	// 예외발생 : ArithmeticException
//	    System.out.println( result );

			// 배열의 특정 값을 저장
			int arrayValue = intArray[4]; // 예외발생 : ArrayIndexOutOfBoundsException
			System.out.println(arrayValue);

		} catch (ArithmeticException ae) { // 0으로 나눌시 발생하는 오류
			System.out.println(ae.toString());

		} catch (ArrayIndexOutOfBoundsException ai) { // 배열의 범위를 벗어날시 발생하는 오류
			ai.printStackTrace();

		} finally {
			System.out.println("예외가 발생했음!"); // 예외가 발생하든 안하든 항상 발생한다.

		}
	}
}

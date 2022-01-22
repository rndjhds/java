package p2022_01_13;

// 입출력에 관한 패키지 import
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public static void main(String[] args) throws Exception { // JVM이 예외처리하라는 식으로 throws Exception을 써준다.

		// InputStream 객체 생성
		// System.in은 표준입력 장치인 키보드로 부터 입력 받는것을 의미함.
		// 1byte의 영문자,숫자를 1개 입력받는 바이트 기반 스트림
		InputStream is = System.in; // in에서 리턴값이 InputStream형으로 리턴된다.
		int inputValue = 0;

		System.out.print("Input Data : ");

//		try {
		// 키보드로부터 값을 입력 받음
		// read() 메소드는 1바이트를 읽어들여서 
		// ascii 코드(0~127)값으로 casting함. : int형으로 리턴
		inputValue = is.read(); // 입출력은 예외처리를 같이 써줘야 한다. // inputValue에는 is.read()에 입력된 값을 저장 a 입력
//		} catch (IOException io) {
		// System.out.print(io.toString());
//			System.out.print(io.getMessage());
//		} // 한글 처리를 못함.

		System.out.println("InputData is " + inputValue); // 97
		System.out.println("InputData is " + (char) inputValue); // a
	}
}

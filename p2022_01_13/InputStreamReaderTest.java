package p2022_01_13;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public static void main(String[] args) {

		// byte Stream인 is 선언
		InputStream is = System.in;	// 1byte를 받을수 있는 바이트 기반 스트림 : 영문자 1글자만 인식
						// System.in은 키보드로 입력을 받는다.
		// InputStreamReader 객체 선언
		InputStreamReader isr = new InputStreamReader(is);	// 2byte를 받을 수 있는 문자 기반 스트림
//									InputStreamReader(System.in);	// 한글 1글자만 인식
		int inputValue = 0;
		System.out.print("Input Value : ");
		try {
			// 키보드로 부터 데이터를 입력
			// 2바이트씩 읽어들이기 때문에 한글은 1자 밖에 입력이 안됨.
			inputValue = isr.read();	// inputValue에는 isr.read()에 저장된 값을 저장
		} catch (IOException io) {
			System.out.print(io.getMessage());
		}
		// 입력받은 데이타를 출력
		System.out.println("Input Result : " + inputValue);
		System.out.println("Input Result : " + (char) inputValue);
	}
}

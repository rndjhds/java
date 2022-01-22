package p2022_01_13;

import java.io.*;

public class FileReaderTest {
	public static void main(String[] args) {

		// FileReader 객체 선언
		FileReader file = null; // 2byte를 읽어오는 문자 기반 클래스
		int inputValue = 0;

		try {
			// "data.txt" File과 stream 형성
			file = new FileReader("data.txt");

			// file의 끝을 만날 때까지 데이터를 읽어 들임
			while ((inputValue = file.read()) != -1) {
				System.out.print((char) inputValue);
			}

			// stream을 닫음
//			file.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			if (file != null) // 그냥 닫으면 오류가 생김
				try {
					file.close();
				} catch (Exception e) {
				}
		}
	}// main() end
}

﻿package p2022_01_13;

import java.io.*;

public class FileInputStreamTest {
	public static void main(String[] args) {

		// 입력을 받아들이는 변수 선언
		int inputValue = 0;

		// FileInputStream 객체 선언
		FileInputStream file = null;

		try {
			// "read.txt"와 InputStream 형성
			file = new FileInputStream("read.txt"); // 상대경로
//			file = new FileInputStream("c:/read.txt");	// 절대경로

			// file의 끝을 만날 때까지 데이터를 읽어 들임
			// read() 메소드는 File에서 한 byte씩 데이터를 읽어옴.
			// 읽어온 데이터를 int로 변환해서 리턴,파일의 끝을
			// 만나면 -1을 반환함.
			while ((inputValue = file.read()) != -1) {	// read()메소드에서 -1을 리턴할때까지 계속리턴
				System.out.print((char) inputValue);	// 파일안에 문자를 다 읽고 없을 시 -1리턴
			} // file.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			if (file != null)
				try {
					file.close();
				} catch (Exception e) {
				}
		}

		// stream을 형성한 file을 닫음
//		try {
//			file.close();
//		} catch (IOException io) {
//			System.out.println(io.toString());
//		}
	}// main() end
}

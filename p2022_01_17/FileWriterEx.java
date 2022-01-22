package p2022_01_17;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 키보드로 입력한 문장을 파일(result.txt)로 저장하는 프로그램을 작성하세요?
// 키보드 입력 : BufferedReader
// 파일 출력 : FileWriter

		System.out.println("문장을 입력하세요?");
//		FileWriter fw = null;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String input = br.readLine();	// 예외처리를 필요로 한다.

//			bufferedReader는 2byte를 리턴하는 스트림이기 때문에 FileWriter로 받아줘야 한다.
			FileWriter fw = new FileWriter("result.txt");
//			fw = new FileWriter("result.txt");
			fw.write(input);

			fw.close();	// close()하지 않으면 파일은 생성되지만 내용이 저장되지 않을 수 있다.
			System.out.println("저장 성공~!!");
		} catch (Exception e) {
			e.printStackTrace();
		}// finally {
//			if(fw != null) try {fw.close();} catch (Exception e2) {}
//		}

	}
}


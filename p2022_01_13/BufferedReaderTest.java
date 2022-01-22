package p2022_01_13;

import java.io.*;

public class BufferedReaderTest {
	public static void main(String[] args) throws Exception{

		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);	// InputStreamReader는 Reader의 자식 클래스이므로 들어갈수 있다.
											 //업캐스팅	
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 
		System.out.print("Input Data : ");

		try {// 입력한 한줄을 모두읽음.
			String inputString = br.readLine();	// readLine() 메소드의 리턴값은 String형이다.
			System.out.println();
			System.out.println("Output String = " + inputString);
		} catch (IOException io) {
			System.out.println(io.getMessage());
		}
	}// main() end
}

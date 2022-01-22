package homework;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferedEx {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fi = null;
		String str;

		try {
			fi = new FileWriter("result.txt");
			str = br.readLine();
			fi.write(str);
			System.out.println(str);
			
			fi.close();	// 닫아줘야 제대로 실행된다.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

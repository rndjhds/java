package p2022_01_03;

public class FindBlankIndex {
	public static void main(String[] args) {

		String message = "Java program creates many objects.";

		// message의 길이를 구함.
		// length() : 문자열의 길이를 구해준다. 글자수를 구해줌.
		int len = message.length();

		System.out.println(len); // len = 34;

		// message 중에서 ' '을 찾음
		for (int i = 0; i < message.length(); i++) {
			char c = message.charAt(i);	// charAt() 메소드는 주어진 인덱스 넘버의 char값을 반환해준다. 
										// 인덱스 번호는 0부터 시작
			if (c == ' ') {	// 공백
				System.out.println("index = " + i);
			}
		} // for end
	}
}

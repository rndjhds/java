package p2022_01_04;

public class ReplaceEx {

	public static void main(String[] args) {

// p506
// replace("자바", "JAVA") : 자바를 JAVA로 치환해주는 역할

		String oldStr = "자바는 객체지향 언어입니다.";

		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}

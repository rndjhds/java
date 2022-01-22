package p2022_01_04;

// p515
// valueOf() : 기본 자료형을 문자열로 변환
//				ex) 20 ----> "20"
//					3.14 --> "3.14"
//					true --> "true"

public class ValueOfEx {

	public static void main(String[] args) {

		String str1 = String.valueOf(20); // 20 --> "20"
		String str2 = String.valueOf(3.14); // 3.14 --> "3.14"
		String str3 = String.valueOf(true); // true --> "true"
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}

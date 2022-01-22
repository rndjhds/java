package p2022_01_03;

class StringTest00 {
	public static void main(String[] args) {

		String str1 = new String("Java Programming");
		String str2 = new String("Java Programming");

		if (str1 == str2) { // 주소 비교
			System.out.println("같다");
		} else {
			System.out.println("다르다");	// 다르다
		}

		String str3 = "Java Programming";
		String str4 = "Java Programming";

		if (str3 == str4) { // 주소 비교
			System.out.println("같다");	// 같다
		} else {
			System.out.println("다르다");
		}
		
		if (str1 == str3) { // 주소 비교
			System.out.println("같다");
		} else {
			System.out.println("다르다");	// 다르다
		}
		
		if (str1.equals(str3)) { // 값(데이터) 비교		// equals메소드는 참조형 변수에서 사용
			System.out.println("같다");	// 같다		// 기본형 사용x
		} else {
			System.out.println("다르다");
		}
	}
}
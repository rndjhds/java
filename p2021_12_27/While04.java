package p2021_12_27;

public class While04 {

	public static void main(String[] args) {

// while문을 이용해서 구구단(2 ~ 9단)을 출력하는 프로그램을 작성하세요?

		int i = 1, dan = 2; // 초기값
		while (dan <= 9) {  // 조건식 : 단
			System.out.println("[" + dan + "단]");
			while (i <= 9) {
				System.out.println(dan + "*" + i + "=" + dan * i);
				i++; // 증감식
			}
			dan++; // 증감식
			i = 1; // i를 1로 초기화
			System.out.println(); // 줄간격 벌리기
		}
	}

}

package p2021_12_27;

public class Continue01 {

	public static void main(String[] args) {

// continue문
// 1. 다시 반복문으로 돌아가라는 의미를 가지고 있다.
// 2. continue문이 실헹되면, continue문 아랫쪽의 내용들은 실행되지 않고
//	다시 반복문으로 돌아간다.

		for (int i = 1; i <= 10; i++) {
			if (i == 5)
				continue;
			System.out.println("출력:" + i);
		}
	}

}

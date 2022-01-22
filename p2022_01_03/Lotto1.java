package p2022_01_03;

import java.util.Arrays;

class Lotto1 {

	public static void main(String[] args) {

		int num[] = new int[6];

		for (int i = 0; i < num.length; i++) {

			num[i] = (int) (Math.random() * 45) + 1; // 1 ~ 45
//			num[0]=5, num[1]=5,
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) { // 중복
					i--;
					break; // 아래 실행될 문장이 없어도 결과는 같다. 하지만 반복문을 빠져 나오는 시간의 차이가 있다.
							// break문을 쓰는걸 추천한다.
				} // if end

			} // for end
		} // for end

		// 오름차순 정렬 : 버블정렬(자신의 옆자리에 있는 것과 비교) // 개인적으로 공부하기(자격증시험에 나옴)
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

//		Arrays.sort(num); // 오름차순 정렬

		for (int k : num) {
			System.out.print(k + "\t");
		}
	}
}

/*
 * 난수 발생 공식 난수 =(정수화) ((상한값-하한값+1)* Math.random()) + 하한값
 * 
 */
package p2021_12_29;

public class Arr04 {

	public static void main(String[] args) {

		int[][] score = { { 85, 60, 70 }, // 0 행
				{ 90, 95, 80 }, // 1 행
				{ 75, 80, 100 }, // 2 행
				{ 80, 70, 95 }, // 3 행
				{ 100, 65, 80 } // 4 행
		};
		int[] subject = new int[3]; // 과목총점 저장
		int[] student = new int[5]; // 학생의 총점 저장
		// subject[0]=0, subject[1]=0, subject[2]=0	 
		// student[0]=0, student[1]=0, student[2]=0, student[3]=0, student[4]=0
		int r, c;
		String[] subName = new String[] {"국어", "영어", "수학"};
		String[] stuNum = new String[] {"1번 학생", "2번 학생", "3번 학생", "4번 학생", "5번 학생"};

		System.out.println("각 과목별 총점구하기 ");
		for (c = 0; c < 3; c++) { // 과목
			for (r = 0; r < 5; r++) { // 학생
				subject[c] += score[r][c];
			} // subject[c]=subject[c]+score[r][c];

			System.out.println(subName[c]+"총점:"+subject[c]);
		}

		System.out.println("학생별 총점구하기");
		for (r = 0; r < 5; r++) { // 학생
			for (c = 0; c < 3; c++) { // 과목
				student[r] += score[r][c];
			} // student[r]=student[r]+score[r][c];
			System.out.println(stuNum[r]+"총점:"+student[r]);
		}
		
	}// main() end
}// class end
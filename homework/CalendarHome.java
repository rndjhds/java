package homework;

import java.util.Calendar;

public class CalendarHome {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH) + 1;
		int d = c.get(Calendar.DATE);

		System.out.println(y + "년" + m + "월" + d + "일");

		int h1 = c.get(Calendar.HOUR_OF_DAY);
		int h2 = c.get(Calendar.HOUR);

		int mt = c.get(Calendar.MINUTE);
		int s = c.get(Calendar.SECOND);

		int ap = c.get(Calendar.AM_PM);
		if (ap == 0) {
			System.out.print("오전");
		} else {
			System.out.print("오후");
		}
		System.out.println(h1 + "시" + mt + "분" + s + "초");

		String[] day = { "일", "월", "화", "수", "목", "금", "토" };

		int day1 = c.get(Calendar.DAY_OF_WEEK); // int형으로 출력

		System.out.println(day[day1 - 1] + "요일");

	}

}

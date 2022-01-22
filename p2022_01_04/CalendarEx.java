package p2022_01_04;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEx {

	public static void main(String[] args) {

// 3. Calendar 클래스  : Singelton패턴으로 코딩이 되어있는 클래스이므로 new연산자로 객체 생성 불가능

		// 오류 발생
//		Calendar c1 = new Calendar(); 객체 생성 불가능 : 정적이고 접근제어자가 protected이기 때문이다.

		// 방법1 : 자식 클래스로 만들고 형변환
		Calendar c2 = new GregorianCalendar(); // 클래스 형태의 자료형변환 : 래퍼런스 형변환
												// 부모 클래스 = 자식 클래스 : 래퍼런스 형변환 중 업캐스팅

		// 방법2. getInstance() 메소드 활용
		Calendar c = Calendar.getInstance(); // 가장 많이 쓰는 일반적인 방법
		System.out.println(c);
		System.out.println(Calendar.YEAR); // YEAR는 정적 // 1

		int y = c.get(Calendar.YEAR); // 연
		int m = c.get(Calendar.MONTH) + 1; // 월(0 ~ 11)
		int d = c.get(Calendar.DATE); // 일
		System.out.println(y); // 2022
		System.out.println(y + "-" + m);
		System.out.println(y + "-" + m + "-" + d);

		int h1 = c.get(Calendar.HOUR); // 12시간
		int h2 = c.get(Calendar.HOUR_OF_DAY); // 24시간

		int ap = c.get(Calendar.AM_PM); // 0:오전, 1:오후
		if (ap == 0) {
			System.out.print("오전");
		} else {
			System.out.print("오후");
		}

		int mm = c.get(Calendar.MINUTE); // 분
		int s = c.get(Calendar.SECOND); // 초

		System.out.println(h1 + ":" + mm + ":" + s); // 12시간
		System.out.println(h2 + ":" + mm + ":" + s); // 24시간

	}

}

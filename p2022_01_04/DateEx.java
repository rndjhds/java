package p2022_01_04;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {

// 날짜 시간 관련 클래스 : Date, Timestamp

// 1. Date
// 		년, 월, 일, 시, 분, 초, 요일로 패턴 설정
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss EEE요일");
		// hh : 12시간제
		// HH : 24시간제

		Date d = new Date();
		System.out.println(d); // Tue Jan 04 17:17:53 KST 2022
		System.out.println(sd.format(d)); // 2022년 01월 04일 17:17:53 화요일

//	2. Timestamp

		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Timestamp ts = new Timestamp(System.currentTimeMillis());
		System.out.println(ts); // 2022-01-04 17:17:53.239
		System.out.println(sd.format(ts)); // 2022년 01월 04일 17:17:53 화요일
		System.out.println(sf.format(ts)); // 2022-01-04 17:20:45

	}

}

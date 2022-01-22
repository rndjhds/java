package homework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadDate implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E요일");
			Date d = new Date();
			System.out.println(Thread.currentThread().getName() + sf.format(d));
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		ThreadDate t = new ThreadDate();
		Thread t1 = new Thread(t, "날짜");

		t1.start();

	}

}

package p2021_12_30;

class MyDate05 {
	private int year; // 필드, 멤버변수
	private int month;
	private int day;

// 기본 생성자는 객체를 생설할 때 컴파일러가 자동으로 만들어 주지만,
// 예외적으로 매개변수를 가진 생성자가 있을 경우에는 더이상 기본 생성자를 만들어 주지 않는다.
	public MyDate05() { // 기본 생성자
	}

	// 생성자의 매개변수명과 필드명이 동일한 이름으로 되어 있을때는, 매개변수의 값이 필드로 전달되지 않는다. : 해결방법은 this.을 붙여주는것이다.
	public MyDate05(int new_year, int new_month, int new_day) { // 매개변수가 있는 생성자
		year = new_year; // 2017
		month = new_month; // 7
		day = new_day; // 19
	}
 
	public void print() { // 메소드
		System.out.println(year + "/" + month + "/" + day);
	}
}

public class ConstructorTest05 {
	public static void main(String[] args) {
		MyDate05 d = new MyDate05();
//						 생성자 호출
		d.print();

		MyDate05 d2 = new MyDate05(2017, 7, 19);
//						    매개변수를 가진 생성자 호출
		d2.print();
	}
}
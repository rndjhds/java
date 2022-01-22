package p2021_12_30;

class MyDate06 {
	private int year; // 필드, 멤버변수
	private int month; // 필드, 멤버변수
	private int day; // 필드, 멤버변수

	public MyDate06(int year, int month, int day) { // 매개변수가 있는 생성자 : 필드값을 초기화 시키는 역할
		this.year = year;	// 매개변수와 필드의 이름이 같을 경우 필드에 this.을 붙여서 구분해준다.
		this.month = month;
		this.day = day;
	}

//  public MyDate(){	//default 생성자
//  }  
//	public MyDate06(int new_year, int new_month, int new_day) {
//		year = new_year; // 2017
//		month = new_month; // 7
//		day = new_day; // 19
//	}

//	public void SetYear(int year) {	// year의 값전환 용도 : 필드가 private이기 때문에
//		this.year=year;
////		year = year; // 매개변수로 전달된 값이 멤버변수에 전달되지 않는다.
//	}
//
//	public void SetMonth(int new_month) {	// month의 값전환 용도 : 필드가 private이기 때문에
//		month = new_month; // month=8
//	}

	public int getYear() { // getters method
		return year;
	}

	public int getMonth() { // getters method
		return month;
	}

	public int getDay() { // getters method
		return day;
	}

	public void setYear(int year) { // setters method
		this.year = year;
	}

	public void setMonth(int month) { // setters method
		this.month = month;
	}

	public void setDay(int day) { // setters method
		this.day = day;
	}

	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
}

public class ConstructorTest06 {
	public static void main(String[] args) {
		MyDate06 d = new MyDate06(2017, 7, 19);
		d.print(); // 2017/7/19
//		d.year = 2018;	// 접근제어자가 private이기 때문에 외부 클래스에서 접근 할 수 없다.
						// private은 자기자신의 클래스에서만 사용가능
		d.setYear(2021); // 변경되지 않음 : 멤버변수명과 매개변수명이 같기 때문이다.
		d.print();

		d.setMonth(12); // 변경됨
		d.print();

		d.setDay(30);
		d.print();

		System.out.println(d.getYear()); // 2021
		System.out.println(d.getMonth()); // 12
		System.out.println(d.getDay()); // 30

	}
}
package p2021_12_30;

// this() : 같은 클래스 안에 있는 생성자를 호출할 때 사용한다.
class MyDate10 {

	private int year;
	private int month;
	private int day;

	// 생성자 오버로딩 (overloading) : 한개의 클래스에 여러개의 같은 이름의생성자를 정의 하는 것.
	// : 매개변수의 자료형, 매개변수의 갯수, 매개변수의 순서로 다르게 만들어준다.
	public MyDate10() { // 기본 생성자
		this(2016, 1, 1);
	}

	public MyDate10(int new_year) {
		this(new_year, 1, 1); // 같은 클래스 안에 생성자 호출
	}

	public MyDate10(int new_year, int new_month) {
		this(new_year, new_month, 1); // 같은 클래스 안에 생성자 호출
//											(public MyDate10(int new_year, int new_month, int new_day)
	}

	public MyDate10(int new_year, int new_month, int new_day) { // this()의 생성자
		year = new_year;
		month = new_month;
		day = new_day;

	}

	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
}

public class ConstructorTest10 {
	public static void main(String[] args) {
		MyDate10 d = new MyDate10(2017, 7, 19);
		d.print();
		MyDate10 d2 = new MyDate10(2017, 7);
		d2.print();
		MyDate10 d3 = new MyDate10(2017);
		d3.print();
		MyDate10 d4 = new MyDate10();
		d4.print();
	}
}
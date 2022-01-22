package p2021_12_30;

class MyDate07 {
	private int year;
	private int month;
	private int day;

	public MyDate07() {
	}

	// 생성자 역시 매개변수의 이름과 속성을 동일하게 줄 수 있다.
	public MyDate07(int year, int month, int day) {
		// 멤버변수로 속성 값을 초기화하려면 대입연산자 왼쪽에 this를 붙여야 한다.
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void SetYear(int year) { // 대입연산자 왼쪽에 this를 붙였기에
		this.year = year; // 속성 값이 변경됨
	}

	public void SetMonth(int month) {// 대입연산자 왼쪽에 this를 붙였기에
		this.month = month; // 속성 값이 변경됨
	}

	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
}

public class ConstructorTest07 {
	public static void main(String[] args) {
		MyDate07 d = new MyDate07(2017, 7, 19);
		d.print();
		// 필드의 접근제어자가 private일 경우 값을 변경하기 위해서는 메소드를 통해서나 생성자를 통해 변경 가능하다.
		// 단, 생성자는 처음 객체 생성시에만 사용가능
		d.SetYear(2018); // 2018년으로 변경
		d.SetMonth(8); // 8월로 변경
		d.print();
	}
}
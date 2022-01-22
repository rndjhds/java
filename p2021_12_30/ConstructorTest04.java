package p2021_12_30;

class MyDate04 {
	int year;	// 필드, 멤버변수
	int month;	// default 접근 제어자
	int day;

	public MyDate04(){ 	// 기본 생성자
		year=2016; 
		month=4; 
		day=1; 
		}

public MyDate04(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

// this : 내부 레퍼런스 변수
//	public MyDate04(int year, int month, int day) {
//		this.year = year;	// this.year가 멤버변수 year는 매개변수
//		this.month = month;
//		this.day = day;
//	}
	

	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
}// MyDate end

public class ConstructorTest04 {
	public static void main(String[] args) {
		MyDate04 d = new MyDate04();
		System.out.println(d.year);	// 2016, 필드가 private이 아니기 떄문에  다이렉트 접근가능
		System.out.println(d.month);
		System.out.println(d.day);
		d.print();		 // 기본 생성자 호출
		
		MyDate04 d2 = new MyDate04(2017, 7, 19);
		System.out.println(d2.year);
		System.out.println(d2.month);
		System.out.println(d2.day);
		d2.print();
	}
}
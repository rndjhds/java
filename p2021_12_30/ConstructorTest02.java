package p2021_12_30;

class MyDate {
	// 필드(field), 멤버변수
	private int year; 
	private int month;
	private int day;

	public MyDate() { // 기본 생성자(Default Constructor)
		System.out.println("[생성자] : 객체가 생성될 때 자동 호출됩니다.");
	}

	public void print() { // 메소드(method)
		System.out.println(year + "/" + month + "/" + day);
	}
}// MyDate end

public class ConstructorTest02 {
	public static void main(String[] args) {
		// 생성자는 객체를 생성할때 호출된다.
		MyDate d = new MyDate();
						// 생성자 호출
//	System.out.println(d.year);	// 오류발생 : private때문에 접근 불가능하다
		d.print();	// 해결방법 : 메소드로 호출해서 출력해준다.
		
	MyDate dd =  new MyDate();
	}
}
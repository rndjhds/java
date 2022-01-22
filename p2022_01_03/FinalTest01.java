package p2022_01_03;

class FinalMember {
// final이 멤버변수(필드)에 사용될 경우
//    -> 상수 (값을 수정할 수 없다)
	final int a = 10; // 상수 : 값을 수정할 수 없다.
// 상수 만드는 방법 : final or static final을 쓴다
//						 보통 많이 씀

	public void setA(int a) { // 매개변수가 있는 메소드 : 매개변수로 a의 값을 수정하는 메소드
//		this.a = a; // a는 파이널이 붙어서 상수가 되었기 때문에 값을 바꿀수 없다
		// this는 내부 레퍼런스로 매개변수와 멤버변수의 이름이 같을 경우 멤버 변수에 붙인다.
	}
}

public class FinalTest01 {
	public static void main(String[] args) {
		FinalMember ft = new FinalMember(); // 객체 생성
		final int a = 1000; // 상수
//		ft.setA(100);	// 상수이기때문에 값 변화 불가능
		System.out.println(a);
		System.out.println(ft.a);
	}
}

// final이 필드, 메소드, 클래스에 붙을경우
// 1. 필드 : 필드는 상수가 되어서 값 수정이 불가능하다.
// 2. 메소드 : 메소드 오버라이딩이 불가능하다.
// 3. 클래스 : 상속을 할수 없다.

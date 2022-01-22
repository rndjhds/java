package p2022_01_03;

class FinalMethod {	// 부모 클래스
	String str = "Java ";	// 필드, 멤버 변수

	// public void setStr(String s) {
	// final 붙이면 서브 클래스에서 오버라이딩이 불가. 
	public final void setStr(String s) {	// 메소드 : 메소드에 final이 붙으면 상속은 가능하지만 오버라이딩 불가능
		str = s;							// 오버라이딩 : 상속할 때 사용가능하고 부모의 메소드 이름을 사용하지만 내용을 다르게 기술하는 것을 의미
		System.out.println(str);
	}
}
// 상속 방법 : 자식클래스명 extends 부모클래스 : FinalEx는 FinalMethod의 자식 클래스
// 상속이 되는 것 : 필드와 메소드가 된다. 생성자는 상속 불가능
class FinalEx extends FinalMethod { // extends는 상속을 의미		// 자식 클래스
	int a = 10; // final 붙이면 밑에서 a값 대입 불가.

	public void setA(int a) {
		this.a = a;
	}

	public void setStr(String s) {	// 메소드 오버라이딩 : 부모의 이름과 형식을 그대로 따르지만 내부에 기술된 내용이 다름
		str += s;					// 오버라이딩이 안되서 같은 이름을 쓰면 안된다.
		System.out.println(str);
	}

}

public class FinalTest02 {
	public static void main(String[] args) {
		FinalEx ft = new FinalEx();
		ft.setA(100);
		ft.setStr("hi");// 슈퍼 클래스의 setStr을 실행.
		FinalMethod ft1 = new FinalMethod();
		ft1.setStr("hi");// 자신의 클래스의 setStr을 실행.
	}
}
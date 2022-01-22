package p2022_01_03;

// 상속을 허용하지 않는다
final class FinalClass {	// 부모 클래스
	String str = "Java ";

	public void setStr(String s) {
		str = s;
		System.out.println(str);
	}
}
// 부모클래스가 final이 붙어서 상속을 허용하지 않아 상속 받는 자식클래스에서 문제가 생긴다.
class FinalEx extends FinalClass {	// 자식 클래스 
	int a = 10;

	public void setA(int a) {
		this.a = a;
	}

	public void setStr(String s) {
		str += s;
		System.out.println(str);
	}
}

public class FinalTest03 {
	public static void main(String[] args) {
		FinalEx fe = new FinalEx();
	}
}
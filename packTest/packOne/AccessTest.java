package packTest.packOne;

// 부모 클래스
public class AccessTest { // 다른 패키지에서 가져다 사용할 것임으로 pubic으로
	private int a = 10; // [1] private
	int b = 20; // [2] 기본 접근 지정자
	protected int c = 30; // [3] protected
	public int d = 40; // [4] public

	public void print() {
		System.out.println("AccessTest의 print");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
// p2022_01_06 superSubA.java와 연동
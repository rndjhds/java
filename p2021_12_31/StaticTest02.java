package p2021_12_31;

class StaticTest2 {
	private static int a = 10; // 정적 필드, 정적 멤버변수
	private int b = 20; // 인스턴스 필드, 인스턴스 멤버변수

	public static void setA(int new_a) { // 정적 메소드
		a = new_a; // 10000	
		// a의 접근제어자가 private이기 때문에 직접변경이 안되서 메소드로 변경해줘야 한다.
	}

	public static int getA() { // 정적 메소드
		return a;
	}
}

public class StaticTest02 {
	public static void main(String[] args) {
//		System.out.println(StaticTest2.a);// a가 private으로 선언되어서 컴파일 에러 발생
		System.out.println(StaticTest2.getA());

		StaticTest2 s1 = new StaticTest2();
		StaticTest2 s2 = new StaticTest2();

		s1.setA(10000);	// 정적 필드여셔 컴파일은 되지만 문제가 있다.
		int res1 = s1.getA();	// 정적 메소드여셔 클래스.메소드로 호출권장
		System.out.println(res1);
		System.out.println(s2.getA());	// a는 static이기 때문에 공유메모리에 저장되어서 s1과s2의 주소가 같아 값이 똑같다.
	}
}
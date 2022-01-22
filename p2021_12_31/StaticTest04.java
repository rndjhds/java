package p2021_12_31;

class StaticTest4 {
	private static int a = 10; // 정적 필드, 정적 멤버변수
	private int b = 20; // 인스턴스 필드, 인스턴스 멤버변수

	public static void printA() { // 정적 메소드
		System.out.println(a);
//		System.out.println(b); // 컴파일 에러 발생 : 정적 메소드안에는 정적 필드만 사용할 수 있다.
	}

	public void printB() {
		System.out.println(b);
		System.out.println(StaticTest4.a); // 인스턴스 메소드는 정적 필드가 올 수 있다.
											// 같은 클래스에 존재시 StaticTest4 생략가능
											// 외부 클래스 일 경우 class명을 써야한다. 
	}
}

public class StaticTest04 {
	public static void main(String[] args) {
		StaticTest4.printA();
		StaticTest4 s1 = new StaticTest4();
		StaticTest4 s2 = new StaticTest4();
		s1.printB();
		s2.printB();
	}
}
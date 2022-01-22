package p2021_12_31;

// main()메소드가 없기 때문에 컴파일만 되고 실행은 안된다.
public class NoneObject {
	static int number; // 정적 필드, 정적 멤버변수
							// static은 메소드영역에 저장, stack, heap에 저장x

	public static void printNumber() { // 정적 메소드
		System.out.println("number = " + number);
	}
}
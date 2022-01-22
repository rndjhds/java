package p2021_12_31;

public class UseNoneObject {

	public static void main(String[] args) {

		NoneObject no = new NoneObject(); // 정적 필드, 정적 메소드여서 권장하는 방법은 아니다.
		System.out.println("no.number = " + no.number);
		no.printNumber();	// 정적 메소드이기때문에 클래스.메소드명을 입력하는걸 권장한다.

		System.out.println("NoneObject.number = " + NoneObject.number);
		NoneObject.printNumber();

	}
}
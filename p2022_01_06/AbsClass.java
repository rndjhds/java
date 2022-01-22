package p2022_01_06;

// 추상 클래스 : 자체적으로 객체를 생성할 수 없는 클래스를 말합니다
public abstract class AbsClass {

	int a = 10;

	void check() {
		System.out.println("메소드 호출 성공");
	}

	abstract void absmethod(int a); // 추상 메소드
//	일반 메소드랑 동일하게 만들수 있다.
//	단 앞에 abstract가 있어야하고 내용이 없어야 한다.
}

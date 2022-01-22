package p2022_01_07;

abstract class AbstractClass { // 추상 클래스
	abstract void Method01(); // 추상 메소드 : 이름만 있고 내용은 없는 메소드이다.
// 추상 메소드는 추상 클래스, 인터페이스가 가진 큰 특징이다.
// 추상 클래스는 단일 상속만 가능

	void Method02() { // 일반 메소드
		System.out.println("Method02:  추상클래스에서 구현");
	}
}

// 추상 클래스를 상속 받으면, 추상 클래스 안에 있는 추상 메소드를 자식 구현 클래스에서 
// 반드시 메소드 오버라이딩을 해야 한다.
class SubClass extends AbstractClass {

	@Override // 오버라이드 어노테이션은 컴파일러 과정에서 오버라이딩이 제대로 되었는지 확인하는 과정
	void Method01() { // 메소드 오버라이딩
//		 super.Method01(); : 부모 클래스에서 은닉된 메소드를 불러오는 방법 
							// 추상 메소드를 super.으로 불러오면 오류발생
		// TODO Auto-generated method stub
		System.out.println("Method01: 서브클래스에서 구현된 추상메소드");
	}
}

class AbstractTest01 {
	public static void main(String args[]) {
//		추상클래스는 자체적으로 객체 생성을 할 수 없다. : 구현 클래스에 상속을 통해서만 객체를 생성할 수 있다.
//		AbstractClass  ac = new AbstractClass();

		SubClass obj = new SubClass();
		obj.Method01(); // 메소드 오버라이딩된 메소드가 호출된다.
		obj.Method02(); // 부모 추상클래스에서 상속받은 Method02()메소드가 호출된다.
	}
}

// 추상 클래스는 일반 클래스와 거의 동일하지만 차이점은 추상메소드의 유뮤입니다.
// 정적 메소드는 메소드 오버라이딩되지 않는다. 
// 추상 클래스의 구성 요소 : 필드, 일반 메소드, 추상 메소드, 생성자(있었도 되고 없어도 됨)
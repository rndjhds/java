package p2022_01_07;

// 래퍼런스 형변환은 두 클래스 사이에 상속관계가 있어야 쓸 수 있다.
class Parent { // 부모 클래스
	public void parentPrn() {
		System.out.println("슈퍼 클래스 : ParentPrn 메서드");
	}
}

class Child extends Parent { // 자식 클래스
	public void childPrn() {
		System.out.println("서브 클래스 : ChildPrn 메서드");
	}
}

// * 업캐스팅(자동 형변환)
// 1. 서브클래스에서 슈퍼클래스로 형변환 하는 것
// 2. 참조 가능한 영역이 축소가 된다.
// 3. 컴파일러에 의해서 암시적 형변환(자동 형변환)된다.

class RefTest01 {
	public static void main(String[] args) {
		Child c = new Child();
		c.parentPrn(); // 상속받은 메소드 호출
		c.childPrn();

		Parent p;
		p = (Parent)c; // 업캐스팅 : 자료형 변환 생략 가능

		Parent p1 = new Child(); // 업캐스팅

//		업캐스팅이 되면 부모 클래스가 상속해준 메소드만 접근할 수 있고, 상속 해주지 않은 메소드는 
//		접근 할 수 없다.
		p.parentPrn(); // 업 캐스팅 후에는 부모로부터 상속받은 메서드만 호출할 수 있다,
//		p.childPrn(); // 컴파일 에러가 발생하게 된다.
	}
}
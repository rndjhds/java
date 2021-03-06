package p2022_01_07;

// 다운 캐스팅은 업캐스팅 후 해야 오류없이 일어난다.
// Child c = (Child) new Parent(); 오류 발생
// Child c;
// Parent p = new Child();	// 업캐스팅
// c = (Child)p;	// 다운 캐스팅(명시적 형변환)
class Parent03 { // 부모 클래스
	public void parentPrn() {
		System.out.println("슈퍼 클래스 : ParentPrn 메서드");
	}
}

class Child03 extends Parent03 { // 자식 클래스
	public void childPrn() {
		System.out.println("서브 클래스 : ChildPrn 메서드");
	}
}
//다운 캐스팅(강제 형변환)
//1. 슈퍼클래스에서 서브클래스로 형변환 하는것
//2. 참조 가능한 영역이 확대가 된다.
//3. 컴파일러에 의해서 암시적 형변환(자동 형변환)이 되지 않기    
//   때문에 자료형을 생략할 수 없다.(강제 형변환)

class RefTest03 {
	public static void main(String[] args) {
		Parent03 p = new Child03(); // 업캐스팅
		p.parentPrn();	// 상속해준 메소드만 호출 가능
		// p.childPrn();//-컴파일 에러 : 부모로부터 상속받은 메소드만 출력가능
		Child03 c; // 서브 클래스로 레퍼런스 변수 선언
		System.out.println("---------------->>");
		// 서브 클래스 레퍼런스 변수에 슈퍼 클래스의 레퍼런스 값이 대입됨
		c = (Child03) p; // 강제 형변환으로 다운 캐스팅
		
		Child03 c1 = (Child03) p;	// 다운 캐스팅
		
		c.parentPrn();
		c.childPrn();
	}
}
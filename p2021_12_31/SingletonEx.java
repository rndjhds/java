package p2021_12_31;

// p244

// static 메소드, 필드를 쓰지않는 이유 : static영역에 공유가 되고 메모리영역에 프로그램이 종료될떄 까지 사라지지
// 않기 때문에 잘 쓰지 않는다.

class Singleton {

	// 싱글톤(Singleton) : 객체 생성을 1번만 수행 : DB연동에 쓰인다.
	// Calendar클래스도 싱글톤으로 생성되어 있다.
	private static Singleton s = new Singleton(); // 정적 필드 : 싱글톤 생성 방법

	public static Singleton getInstance() { // 정적 메소드 : 정적필드를 공유를 하기위해 정적 메소드를 이용한다.
		return s; // s를 공유하겠다는 의미 : s가 싱글톤이기 때문에
	}

	public void check() {
		System.out.println("메소드 호출 성공1");
	}

	public void check1() {
		System.out.println("메소드 호출 성공2");
	}
}

public class SingletonEx {

	public static void main(String[] args) {

//		Singleton st = new Singleton(); 
//		System.out.println(Singleton.s);	// 접근이 안됨 : private으로 막혀있기 떄문에 다이렉트 연결 불가능
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		System.out.println(obj1);
		System.out.println(obj2);

		if (obj1 == obj2) { // 주소값 비교
			System.out.println("같은 주소");
		} else {
			System.out.println("다른 주소");
		}
		obj1.check();
		obj1.check1();
		obj2.check();
		obj2.check1();
	}

}

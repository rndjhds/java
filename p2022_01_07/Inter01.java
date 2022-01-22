package p2022_01_07;

public interface Inter01 {

	int a = 10; // 상수(public static final 생략)

	void check(); // 추상 메소드(public abstract 생략)

}

// 인터페이스는 추상메소드를 가질 수 있으며 다중 상속이 가능해서 상속에서 많이 쓴다.
// 추상클래스의 추상메소드는 abstract를 생략 할 수없지만 Interface의 추상메소드는 abstract를 생략가능
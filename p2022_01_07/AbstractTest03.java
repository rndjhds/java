package p2022_01_07;

abstract class Hello { // 추상 클래스
	public abstract void sayHello(String name); // 추상 메소드
}

abstract class GoodBye { // 추상 클래스
	public abstract void sayGoodBye(String name); // 추상 메소드
}

// 자바에서는 클래스의 다중상속을 허용하지 않는다.
class SubClass03 extends GoodBye,Hello{ // 단일 상속만 가능하지만 다중 상속을 해서 오류가 난다.

	public void sayHello(String name){
      System.out.println(name+"씨 안녕하세요!");
  }

	public void sayGoodBye(String name) {
		System.out.println(name + "씨 안녕히 가세요!");
	}
}

class AbstractTest03 {
	public static void main(String[] args) {
		SubClass03 test = new SubClass03();
		test.sayHello(args[0]);
		test.sayGoodBye(args[0]);
	}
}

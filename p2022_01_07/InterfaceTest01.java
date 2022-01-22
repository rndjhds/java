package p2022_01_07;

interface IHello01 { // 인터페이스 : 접근제어자 써도 되고 안써도 된다.
	void sayHello(String name); // 추상 메소드(public abstract 생략)
}

class Hello01 implements IHello01 { // 인터페이스 상속

	@Override
	public void sayHello(String name) { // 메소드 오버라이딩 : public은 꼭 붙여서 쓸 것
		// TODO Auto-generated method stub
		System.out.println(name+"씨 안녕하세요");

	}
//	public void sayHello(String name) {
////	void sayHello(String name){
//		System.out.println(name + "씨 안녕하세요!");
//	}

}

class InterfaceTest01 {
	public static void main(String[] args) {
// 		인터페이스는 자체적으로 객체 생성을 할 수 없다.
//		IHello01 ih = new IHello();

		Hello01 obj = new Hello01();
		obj.sayHello("홍길동");
		obj.sayHello("이순신");
	}
}

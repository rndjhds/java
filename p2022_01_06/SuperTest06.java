package p2022_01_06;

class Point2D06 { // 부모 클래스
	protected int x = 10; // 필드
	protected int y = 20;

// 매개변수가 있는 생성자가 있을때는 예외적으로 컴파일러가 기본 생성자를 생성해 주지 않는다.
	public Point2D06() { // 기본 생성자(default method)
		System.out.println("슈퍼 클래스인 Point2D 생성자 호출");
	}

	public Point2D06(int xx, int yy) { // 매개변수가 있는 생성자
		x = xx; // x = 50
		y = yy; // y = 60
	}
}

// super()
// 1. super()는 부모 클래스의 매개변수를 가진 생성자를 호출할 때 사용한다.
// 2. super()는 자식 클래스의 생성자 안에서 첫번째 라인에 사용해야 한다.
// 3. super()를 이용해서 부모 클래스의 매개변수를 가진 생성자를 호출하면,
//    더이상 부모 클래스의 기본 생성자를 호출해주지 않는다.

class Point3D06 extends Point2D06 { // 자식 클래스
	protected int z = 30;

	public void print() {
		System.out.println(x + ", " + y + "," + z);
	}

// super()는 자식 클래스의 생성자 안에 써야하고 자식 클래스의  생성자의 맨 윗줄에 써야 한다.
	public Point3D06() { // 기본 생성자(default method)
		super(50, 60); // 부모 클래스의 생성자 호출(매개변수가 있는 생성자)
		System.out.println("서브 클래스인 Point3D 생성자 호출");
	}
}

class SuperTest06 {
	public static void main(String[] args) {
		Point3D06 pt = new Point3D06(); // 생성자 호출
		pt.print();
	}
}
package p2022_01_06;

class Point2D4 { // 부모 클래스
	protected int x = 10; // private int x=10;
	protected int y = 20; // private int y=20;
// 접근 제어자가 private일 경우 상속이 되지 않는다.	
}

class Point3D4 extends Point2D4 { // 자식 클래스
	protected int z = 30;

	public void print() {
		System.out.println(x + ", " + y + "," + z);
	}
}

class SuperSub04 {
	public static void main(String[] args) {
		Point3D4 pt = new Point3D4();
		pt.print();

	}
}
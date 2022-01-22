package p2021_12_30;

class Car { // 메소드 존재x
	// 필드(field)
	String company = "현대 자동차";
	String model = " 그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;

	public Car() { // 기본 생성자(Default Constructor)
					// 매개변수가 없는 생성자
		System.out.println("생성자 호출 성공");
	}

}

public class CarEx { // public(접근제어자)은 파일명과 동일한 class만 가질수 있다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarEx car = new CarEx();
		Car mycar = new Car(); // 생성자는 객체를 생성할때 호출된다. // 생성자 호출 성공
		System.out.println("제작회사:" + mycar.company);
		System.out.println("모델명:" + mycar.model);
		System.out.println("색깔:" + mycar.color);
		System.out.println("최고속도:" + mycar.maxSpeed);
		System.out.println("현재속도:" + mycar.speed); // 0

		// 필드값 변경
		mycar.speed = 60;
		System.out.println("수정된 속도:" + mycar.speed); // 60

	}

}

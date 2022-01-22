package p2021_12_31;

// p232
// 메소드 오버로딩(Method Overloading)
// : 한 개의 클래스 안에 동일한 이름을 가진 메소드를 여러개 정의 하는 것
// 메소드 오버로딩 조건 : 매개변수의 데이터 타입, 갯수, 순서

class Calculator2{
	double areaRect(double width) {
		return width * width;
	}
	double areaRect(double width, double height) {
		return width * height;
	}
}

public class CalculatorEx2 {

	public static void main(String[] args) {
		Calculator2 mycal = new Calculator2();
		
		// 정사각형의 넓이 구하기
		double result1 = mycal.areaRect(10);
		
		// 직사각형의 넓이 구하기
		double result2 = mycal.areaRect(10, 20);
		
		System.out.println("정사각형의 넓이"+result1);
		System.out.println("직사각형의 넓이"+result2);
	}

}

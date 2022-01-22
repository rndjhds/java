package p2021_12_31;

// p217 ~ 218

class Calculator{
	// 메소드
	void powerOn() {	
		System.out.println("전원을 켭니다.");
		return;			// 생략가능
	}
	
	int plus(int x, int y) { // 지역변수 : x, y, result
		int result = x + y;
		return result;	// 생략 불가능 : 자료형이 int로 설정 되었기 때문에 return을 꼭 써줘야 한다.
//		System.out.println("test");
	}
	// return문: plus() 메소드를 호출한 곳에 값을 돌려주는 역할
	// return문은 메소드 가장 마지막 줄에 사용해야 한다.
	
	double divide(int x, int y) {
		double result = x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}

public class CalculatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		cal.powerOn();
//		Calculator.powerOn();	// powerOn() 메소드가 static메소드 일경우 객체 생성 없이 쓸수 있다.
		int result1 = cal.plus(5, 6);
		System.out.println("result1:"+ result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = cal.divide(x, y); // byte가 double로 자동형변환이 일어남
		System.out.println("result2:"+ result2);
		
		cal.powerOff();
	}

}

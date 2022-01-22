package p2021_12_31;

// p227
// 클래스 내부에서 메소드 호출 : 메소드 안에서 다른 메소드 호출

class Calculator1{
	// 메소드
	int plus(int x, int y) {	
		int result = x + y;			// 17
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);	// plus() 메소드 호출 : 같은 클래스안의 메소드에 메소드 호출시 메소드 이름만 가지고 호출가능
		double result = sum / 2;	// 8.5
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);	// avg() 메소드 호출
		println("실행결과:"+ result); // println() 메소드 호출
	}
	
	void println(String message) {
		System.out.println(message);
	}
}

public class CalculatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator1 mycal = new Calculator1();
		mycal.execute(); 	// execute() 메소드 호출
//		execute();          // 오류발생 : 정적 메소드가 아니기 때문에 오류발생 : 정적 메소드여도 클래스.이름으로 호출해야한다.
							// 다른 클래스의 메소드이다.
	}

}

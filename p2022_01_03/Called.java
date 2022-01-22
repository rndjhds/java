package p2022_01_03;

public class Called {
	// 같은 패키지안에 클래스 호출1(Calling과 연결)
	void check() { // check() 메소드
		System.out.println("메소드 호출 성공");
	}
}


//1) 같은 패키지 안에 들어 있는 클래스에 접근 하기 위해서는 접근 제어제가
//	 public이나  default  접근 제어자로 되어 있어야 한다.
//2) 같은 패키지 안에 들어 있는 클래스에 접근 하기 위해서는 import 를 하지 
//	  않아도 된다.
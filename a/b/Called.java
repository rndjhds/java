package a.b;

// p2022_01_03에 생성함
// default package에 Calling과 연동
// 다른 패키지에 있는 사용자 정의 클래스를 호출할 경우 import는 필수 
public class Called {

	public void check() {
		System.out.println("메소드 호출 성공");
	}
}

//1) 다른 패키지 안에 들어 있는 클래스에 접근 하기 위해서는 접근 제어제가
//	 public 접근 제어자로 되어 있어야 한다.
//2) 다른 패키지 안에 들어 있는 클래스에 접근 하기 위해서는 해당 클래스를 import 를 
//	  해야된다.

package p2022_01_03;

// 같은 패키지 안에 있을 경우 사용자 정의 클래스 호출(Called와 연동) : import를 하지 않아도 된다.
// 접근 제어자는 생략(default), public이기 때문에 가능
public class Calling {

	public static void main(String[] args) {

		Called c = new Called();
		c.check(); // check() 메소드 호출
	}

}

//1) 같은 패키지 안에 들어 있는 클래스에 접근 하기 위해서는 접근 제어제가
//	 public이나  default  접근 제어자로 되어 있어야 한다.
//2) 같은 패키지 안에 들어 있는 클래스에 접근 하기 위해서는 import를 하지 
// 	  않아도 된다.

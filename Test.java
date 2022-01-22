import java.util.Date;

public    class Test {
//접근제어자     		사용자 정의 클래스
	
	//main 메소드는 자바가상머신(JVM)이 가장 먼저 호출하는 메소드
	public  static void main(String[] args) {
//  접근제어자	공유			main메소드
		System.out.println("자바 출력 성공");
		
		Date d = new Date();
		System.out.println(d);
	}

}


// Eclipse 단축키
// 실행 : Ctrl + F11
// 주석 처리 : Ctrl + /
// 블록 주석 처리 : Ctrl + Shift + /
// 믈록 주석 해제 : Ctrl + Shift + \
// 복사 : Ctrl + Alt + 방향키(아래)
// 한줄 삭제 : Ctrl + D
// 이동 : Alt + 방향키
// 자동 import : Ctrl + Shift + O

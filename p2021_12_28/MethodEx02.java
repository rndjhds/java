package p2021_12_28;

public class MethodEx02 {

	// 1 ~ n까지 합을 구하는 메소드
	static void sum(int n) {	// 정적메소드 : 객체 생성없이 바로 클래스명.메소드로 쓸수 있다.
		int hap = 0; // 지역 변수
		for (int i = 1; i <= n; i++) {
			hap += i; // hap = hap + i;
		}
		System.out.println("1~" + n + "=" + hap);
	}

	public static void main(String[] args) {
		sum(3);
		sum(5);
		sum(10);
		sum(30);
		sum(50);
		sum(100);
		sum(1000);
		sum(10000);
	}

}

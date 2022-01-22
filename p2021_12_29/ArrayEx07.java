package p2021_12_29;

public class ArrayEx07 {

	// 절대값을 구해주는 메소드
	static int abs(int data) { // int data = -10 	//정적메소드
		if (data < 0) // 음수
			data = -data;
		return data; // return 문 : 메소드 호출한 곳에 값을 돌려주는 역할
	}

	public static void main(String[] args) {	// args는 String형 배열

		// args[0] = "-10";
		System.out.println("args[0]:" + args[0]);
		System.out.println("args[1]:" + args[1]);

		// args[0] = "-10" ---> -10 : 자료형 변환
		int num = Integer.parseInt(args[0]); // int num = -10	// Integer.ParseInt()는 String을 int형으로 바꿔주는 Wrapper클래스
		System.out.println("절대값:" + abs(num)); // abs()메소드 호출
	}

}

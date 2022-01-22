package p2021_12_27;

public class Continue02 {

	public static void main(String[] args) {

// continue문을 이용해서 1 ~ 100까지 정수 중에서 짝수만 츨력하는 프로그램을 작성하세요?
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 1) {	// 홀수
				continue;
			}System.out.println("짝수:"+i);
		}
	}
	
}

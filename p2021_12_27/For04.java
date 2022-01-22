package p2021_12_27;

public class For04 {

	public static void main(String[] args) {

// 1 ~ 100 홀수의 합과 짝수의 합을 구하는 프로그램을 작성하세요?
// 단 for문 1개와 if ~ else문으로 작성하세요?
		
		int odd = 0, even = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 1) {	// 홀수
				odd += i;	
			}else {	// 짝수
				even += i;	
			}
		}
		System.out.println("1~100 홀수의 합="+odd);
		System.out.println("1~100 짝수의 합="+even);
	}

}

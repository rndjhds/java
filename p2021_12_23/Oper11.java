package p2021_12_23;

public class Oper11 {

	public static void main(String[] args) {
		
		// 증감 연산자 : ++, --
		
		int a = 10, b = 10;
		
		System.out.println("a="+a++);	// 후행연산 a=10출력 이때 a값은 11저장
		System.out.println("a="+a);		// a=11출력 
		System.out.println("a="+(++a)); // 선행연산 a=12출력
		
		System.out.println("b="+(++b));	// 선행연산 b=11출력
		System.out.println("b="+b);		// b=11출력
		
		
	}

}

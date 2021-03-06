package p2021_12_29;

public class ArrayEx06 {

	public static void main(String[] args) {
		
// p154
		
		int[] scores;	// heap메모리에 새로운 공간이 생성되지 않았기 때문에 주소값을 가지고 있지 않다.
		scores = new int[] {83, 90, 87};	// new 연산자를 써야지 heap메모리에 새공간이 생긴다.
		
//		int[] scores = new int[] {83, 90, 87};
		
		int sum1 = 0;	// 지역변수 : stack메모리에 저장됨
		for(int i = 0; i < scores.length; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합:"+sum1);
		
		// add 메소드를 호출해서 리턴된 총점을 sum2변수에 저장
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("총합:"+sum2);
		System.out.println("총합:"+add(scores));	// scores = new int{83, 90, 87} 입력
	
	}	//	main() end 

	// 사용자 정의 메소드 : 합을  구해주는 메소드
	public static int add(int[] scores) {	// static : 정적 메소드
											// int[] scores = new int[] {83, 90, 87};
		int sum = 0;	// 지역변수 : stack메모리에 저장됨
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}

}

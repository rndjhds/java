package p2021_12_27;

public class Break01 {

	public static void main(String[] args) {
		
// break : 반복문을 빠져 나오는 역할
// 무한루프 : for문 
//	for(;;) : 무한 루프 또는 for(int a=;;a++)와 같은 조건을 생략
		
		for(int i = 1;;i++) {
			System.out.println(i+"무한 출력");
			if(i==100)
				break;
			
		}
	}

}

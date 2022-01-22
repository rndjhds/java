package p2021_12_27;

public class Break02 {

	public static void main(String[] args) {
		
// break : 반복문을 빠져 나가는 역할
// 무한루프 : while문

//	'무한 출력'을 100번 츨력하세요?
		
		int i = 1;
		while(true) {
			System.out.println(i+"무한출력");
			if(i == 100) break;
			i++;
		}
	}

}

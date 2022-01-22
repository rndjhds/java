package p2021_12_23;

public class If06 {

	public static void main(String[] args) {

// static 형식의 메소드나 클래스는 new연산자를 사용하지 않아도 사용할 수  있다.(String은 써도 되고 안써도 되는 특별한 클래스이다.)
		
//		if(조건식1){
//      	조건식1이 참인경우 실행될 문장;
//		}else if(조건식2){
//      	조건식2가 참인경우 실행될 문장;
//		}else{
//     	 위의 조건식을 만족하지 않을때 실행될 문장;
//		}
		
// 난수 발생 공식
// 난수 = (정수화)(Math.random() * (상한값-하한값+1)); 
		
// 난수 발생
// 1. Math.random(); 범위 : 0.0 <= Math.random(); <1.0

		System.out.println(Math.random()); // 난수 발생
		System.out.println(Math.E); // E(자연로그)
		System.out.println(Math.PI); // PI(원주율)

// 주사위 번호 뽑기 : 1 ~ 6
		int num = (int)(Math.random() * 6) + 1; // 1 ~ 6
		System.out.println("num=" + num);
	if(num == 1) {
		System.out.println("1번 주사위");
	}else if(num == 2) {
		System.out.println("2번 주사위");
	}else if(num == 3) {
		System.out.println("3번 주사위");
	}else if(num == 4) {
		System.out.println("4번 주사위");
	}else if(num == 5) {
		System.out.println("5번 주사위");
	}else {
		System.out.println("6번 주사위");
	}
	
	System.out.println("1~45사이의 난수 발생");
	int r = (int)(Math.random() * 45) + 1;
	System.out.println("난수:"+r);

	}	
}

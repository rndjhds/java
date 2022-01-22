package p2021_12_29;

public class Animal {
//			 사용자 정의 클래스(자료형)
	
	int age;	// 멤버변수, 필드(field), 전역변수(heap 영역에 저장된다.)
				// : 메소드 바깥쪽에서 정의되는 변수
	
	public Animal() {	// 기본 생성자(Default Constructor)
						// : 매개변수가 없는 생성자
						// 접근제어자 생성자명() : 생성자명은 class명과 동일
		System.out.println("생성자 호출 성공");
	}
	
	
	public static void main(String[] args) {
		
		int a = 10;	// 지역변수(stack 영역에 저장된다.)
		
		String str = new String("자바");
		
		Animal a1 		= 	new 	Animal();  // 사용자 클래스로 객체 생성 : new연산자로 객체 생성시 생성자 호출이 1번 일어남	
//		클래스      레퍼런스변수		연산자	생성자 호출
		
//		System.out.println(age);	// 오류 발생
		System.out.println(a1.age);	// 0
		a1.age = 5;
		System.out.println(a1.age);	// 5
		
		Animal a2 = new Animal();	// 사용자 클래스로 객체 생성 : new연산자로 객체 생성시 생성자 호출이 1번 일어남
		System.out.println(a2.age);	// 0
		a2.age = 8;
		System.out.println(a2.age);	// 8
		
		if(a1 == a2) {	// 주소값을 비교
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");	// 다른 주소			
		}
		
		if(a1.equals(a2)) {
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");		// 다른 값: a1.age와 a2.age의 참조값이 다르므로
		}
		
	}

}

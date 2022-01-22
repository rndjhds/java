package p2022_01_05;

public class WrapperEx1 {

	public static void main(String[] args) {

//		Integer num = new Integer();	// 오류 발생

// 박싱(boxing) : heap메모리를 박스로 생각하고, stack메모리에 저장된 10을 
//				 heap메모리에 복사 하는 (박스에 집어 넣는다)
		int n = 10; // 지역변수(stack영역에 저장됨)
		Integer num01 = new Integer(n); // 박싱(boxing)

// 언박싱(unboxing) : heap메모리에 있는 데이터를 stack메모리로 가져 오는것을 의미함. 
		int n01 = num01.intValue(); // 언박싱(unboxing)	// Integer의 값을 int로 리턴해준다.

//		자료형 변환 : "20" --> 20
		Integer num02 = new Integer("20"); // 박싱(boxing)
		int n02 = num02.intValue(); // 언박싱(unboxing)
	}

}

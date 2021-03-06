package p2022_01_05;

public class WrapperEx4 {

	public static void main(String[] args) {

//		Double d = new Double();	// 오류 발생

		Double d1 = new Double(3.14); // 박싱(boxing)
		Double d11 = 3.14; // 자동 박싱

		double n1 = d1.doubleValue(); // 언박싱(unboxing)
		double n11 = d1; // 자동 언박싱

		// 자료형 변환 : "42.195" --> 42.195
		Double d2 = new Double("42.195"); // 박싱(boxing)
//		Double d22 = "42.195"; // 오류 발생
		
		double n2 = d2.doubleValue();	// 언박싱(unboxing)
		double n22 = d2;	// 자동 언박싱
		
		// 자료형 변환 : "42.195" ---> 42.195
		double num = Double.parseDouble("42.195");
		System.out.println("num="+num);
	}

}

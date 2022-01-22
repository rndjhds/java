package p2022_01_04;

public class SplitEx1 {

	public static void main(String[] args) {
		
		
// String[] split("구분기호")
		
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		String[] names = text.split("&|,|-");	// 구분기호가 여러개일경우 split만 지원
												// StringTokenizer지원 x
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println();
		// 향상된 for문, 확장된 for문
		for(String name : names) {
			System.out.println(name);
		}
	}

}

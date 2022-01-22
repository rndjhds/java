package p2022_01_04;

public class AppendStringBuffer {
	public static void main(String[] args) {

// String과 StringBuffer의 차이 : String은 값의 변화가 있을시 주소값이 변하지만 
// StringBuffer는 값이 변하여도 주소값은 변화가 없다. 

		
		// StringBuffer 객체 생성
		StringBuffer sb1 = new StringBuffer("gemini");
		System.out.println("sb1 = " + sb1);

		// StringBuffer sb1에 문자열을 추가해 새로운 객체 생성
		StringBuffer sb2 = sb1.append(" is beautiful");
		System.out.println("sb2 = " + sb2);
		System.out.println("sb1 = " + sb1);
		if(sb1 == sb2) {	// 주소값을 비교
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}

		// 정수형 데이타 형을 추가
		System.out.println(sb1.append(1004));
		System.out.println("sb1 = " + sb1);
		System.out.println("sb2 = " + sb2);

		String str = new String(sb1); // StringBuffer를 String으로 변환 :  toUpperCase()가 없기 때문에
		String str1 = new String(sb2);
		System.out.println(str.toUpperCase());
		System.out.println(str1.toUpperCase());
	}
}

package p2022_01_12;

public class ThrowsEx1 {

	public void setData(String n) throws NumberFormatException {
		if (n.length() >= 1) { // String n = "a"
			String str = n.substring(0, 1); // String str = "a"
			printData(str);
		}
	}

	private void printData(String n) throws NumberFormatException {
		int dan = Integer.parseInt(n); // String n = "a"
		System.out.println(dan + "단"); // 예외발생 : NumberFormatException
		System.out.println("-----------");
		for (int i = 1; i < 10; i++)
			System.out.println(dan + "*" + i + "=" + (dan * i));
	}

	public static void main(String[] args) {
		ThrowsEx1 t1 = new ThrowsEx1();
		// args[0] = "5" 예외발생 하지 않음
		// args[0] = "a" 예외발생 : NumberFormatException
		try {
			t1.setData(args[0]);
		} catch (Exception e) {
			System.out.println("첫문자가 숫자가 아닙니다.");
		}
	}// main() end

}
//throws Exception()을 쓰는 경우는 한개의 클래스안에 동일한 형식의 메소드가 여러개 정의가 되었을 경우에 쓴다.

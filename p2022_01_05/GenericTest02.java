package p2022_01_05;

class TestClass2 {
	private Object member;

	public void setValue(Object value) { // Object value = 3;
		member = value;
	}

	public Object getValue() {
		return member;
	}
}

class GenericTest02 {
	public static void main(String[] args) {
		TestClass2 obj01 = new TestClass2();

//   	Object value = 3;	오토박싱, 업캐스팅
//   	Object value = new Integer(3);	박싱, 래퍼런스 형변환 중 : 업캐스팅		
		obj01.setValue(3);
		System.out.println("되돌리는 값은->" + obj01.getValue());
										 // Object형식
//		다운 캐스팅 + 언박싱
		int n = ((Integer) (obj01.getValue())).intValue(); // 언박싱
//		int n = ((Integer)(obj01.getValue()))	// 오토 언박싱
//		int형으로 바꾸기 위해 Integer를 써줘야 한다.(Object --> Integer로 다운 캐스팅)

//		Object value = 3.4;		오토박싱 + 업캐스팅
//		Object value = new Double(3.4);	박싱 + 업캐스팅
		obj01.setValue(3.4);
		System.out.println("되돌리는 값은->" + obj01.getValue());
		
//		다운 캐스팅 + 언박싱
		double d = ((Double)(obj01.getValue())).doubleValue(); // 언박싱
//		double d = ((Double)(obj01.getValue())) // 오토 언박싱

	
//		Object obj01 = new String("이해할 수 있다.");	박싱 + 업캐스팅
		obj01.setValue("이해할 수 있다.");
		System.out.println("되돌리는 값은->" + obj01.getValue());

//		다운 캐스팅
		String str = (String)(obj01.getValue()); 
	}
}

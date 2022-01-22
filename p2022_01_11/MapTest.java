package p2022_01_11;

import java.util.*;

// Map : 순차적인 자료구조가 아니다.
// 1. 여러가지 자료형의 Data를 모두 저장 할 수 있다.
// 2. Data를 저장할 때 Key,Value를 동시에 저장한다.
// 3. Key값은 중복이 되면 안된다.
// 	    만약에 중복된 Key가 있으면, 가장 마지막에 설정된 Value만 사용할 수 있다.
// 4. Value값은 중복이 되어도 상관없다.

public class MapTest {
	public static void main(String[] args) {

		// Map인터페이스는 자체적으로 객체 생성을 할 수 없다.
//		Map m = new Map(); // 오류발생

		// HashMap 객체 생성
//		Map hm = new HashMap();	// 업캐스팅
		HashMap hm = new HashMap();
		
		// 키와 데이터 쌍을 삽입
//		put(Object Key, Object Value)
		hm.put("woman", "gemini");
		hm.put("man", "johnharu");
		hm.put("man1", "johnharu");	// Value값은 중복이 되어도 상관없다
		hm.put("age", new Integer(10));
		hm.put("city", "seoul");
		hm.put("city", "Busan");	// Key의 값이 중복되어서 마지막에 설정된 Value값이 출력된다.

		// HashMap에 있는 객체들을 출력
		System.out.println(hm);

		// 키 값만 출력
		System.out.println(hm.keySet());

		// 키를 이용해 해당 데이터를 출력
//		Object get(Object key)
		System.out.println(hm.get("woman"));
		System.out.println(hm.get("city"));
	}
}

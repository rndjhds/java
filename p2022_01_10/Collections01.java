package p2022_01_10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Collections01 {
	public static void main(String[] args) {

//		Set 인터페이스만으로는 객체를 생성할 수 없다.
//		Set s = new Set();	// 오류 발셍

		Set set = new HashSet(); // 업캐스팅
//		HashSet	set = new HashSet();	// 상속된 클래스로 객체 생성
		System.out.println("요소의 갯수->" + set.size()); // 0

//		add(Object e) : Object e = new String("하나");
		set.add(new String("하나")); // 업캐스팅
		set.add(2);
		set.add(3.42);
		set.add("넷");
		set.add("five");
		set.add(6);
		set.add(6);	// 중복된 데이터를 저장할 수 없다.
		System.out.println("요소의 갯수->" + set.size()); // 6
		System.out.println(set);

		// Iterator(반복자) : "하나", 2, 3.42, "넷", "five", 6
		Iterator elements = set.iterator();
		while (elements.hasNext()) {	// 가져올 데이터가 있을 때 true리턴
			System.out.println("\t\t" + elements.next());
		}

		/*
		 * Vector에만 적용 Enumeration enu = set.elements(); while( enu.hasMoreElements()){
		 * System.out.println( enu.nextElement() ); }
		 */
	}
}

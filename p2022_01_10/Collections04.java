package p2022_01_10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Collections04 {

	public static void main(String[] args) {
		List list = new ArrayList(); // 업캐스팅
//		ArrayList list = new ArrayList();

//		boolean add(Object e)
		list.add("하나"); // 업캐스팅
		list.add(2);
		list.add(3.42);
		list.add("넷");
		list.add("five");
		list.add(6);
		System.out.println(list);
		System.out.println("원소의 갯수:"	+list.size());

		System.out.println(list.get(2)); // 인덱스 2번 원소 추출 : 3.42
		System.out.println(list.get(4)); // 인덱스 4번 원소 추출 : five

//		Object get(int index) : Set은 사용불가  : 순차적인 List일경우 사용가능
		for (int i = 0; i < list.size(); i++) {
//			System.out.println(i + " 번째 요소는 " + list.get(i));

			Object s = list.get(i);
//			String s = (String) (list.get(i));	// list의 데이터가 혼용되서 String으로 쓸 수 없다.
			// 때문에 Object를 써서 출력
			System.out.println(s);
		}

//		향상된 for문
		for (Object s : list) { // list의 데이터가 혼용되어있어서 Object사용
			System.out.print(s + "\t");
		}
		System.out.println();

//		반복자(Iterator)
		Iterator elements = list.iterator();
		while (elements.hasNext()) {
			System.out.println("\t\t" + elements.next());
		}

	}
}

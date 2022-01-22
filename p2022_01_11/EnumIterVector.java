package p2022_01_11;

import java.util.*;

public class EnumIterVector {

	public static void main(String[] args) {

		// Vector 객체 생성 : List와 마찬가지로 순차적 자료구조이다
		Vector v = new Vector(1, 1); // heap메모리에 공간 1개 생성, 공간 부족시 1개 증가

		// Vector에 Object 저장
		// add(Object e)
		v.add(30); // 업캐스팅
		// addElement(Object e) : Vector만  지원하는 기능
		v.addElement(new Integer(10)); // 업캐스팅
		v.addElement("johnharu"); // 업캐스팅
		v.addElement("gracedew"); // 업캐스팅

		System.out.println(v);

		for (int i = 0; i < v.size(); i++) {
			// Object.get(int index)
			System.out.print(v.get(i) + "\t");
		}
		System.out.println();

		// Vector의 Object의 나열형을 리턴 : Vector의 다른 출력메소드
		// 나열형(Enumeration) : 30 ,10, johnharu, gracedew
		Enumeration e = v.elements(); // Vector만 사용가능
		// Enumeration을 이용해 Vector의 Object를 출력
		while (e.hasMoreElements()) { // 가져올 데이터가 있으면 true리턴
			System.out.println(e.nextElement());
		}

		// Vector의 Object의 나열형을 리턴
		// 반복자(Iterator)
		Iterator ie = v.iterator();
		// Iterator을 이용해 Vector의 Object를 출력
		while (ie.hasNext()) {	// 가져올 데이터가 있으면 true 리턴
			System.out.println(ie.next());
		}

	} // main end
}

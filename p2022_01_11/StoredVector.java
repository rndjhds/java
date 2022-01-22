package p2022_01_11;

import java.util.*;

public class StoredVector {
	public static void main(String[] args) {

		// Vector 객체 생성
		Vector v = new Vector(1, 1); // heap메모리에 공간 1개 생성, 부족시 공간 1개 증가

		// Vector에 객체 저장
		// add(Object e)
		v.add("gemini"); // 업캐스팅
		// addElement(Object e) : Vector만 지원하는 기능
		v.addElement(new Integer(10));
		v.addElement("johnharu");
		v.addElement("gracedew");

		System.out.println(v);

		// Vector에 저장된 객체의 개수를 구함
		int length = v.size();

		// 처음부터 순차적으로 객체를 꺼냄
		for (int i = 0; i < length; i++) {
			System.out.println(v.get(i));
		}

		System.out.println(v.firstElement());	// 첫번째 원소 출력
		System.out.println(v.indexOf("johnharu"));	// Johnharu의 인덱스 번호 출력
		System.out.println(v.isEmpty());	// 빈공간이 있는 확인 : 비어있으면 ture

		// 인덱스가 2인 객체를 삭제
		v.remove(2);	// 2번 인덱스 원소 삭제
		System.out.println(v.elementAt(2));	// 2번인덱스의 원소 출력
		System.out.println(v.get(2));
		// Object.get(int index)와 같은 기능으로 elementAt(int index)가 있다.

		// 인덱스가 2인 객체 값을 "park"로 설정
		v.set(2, "park");	// 2번 인덱스의 원소를 변경
		System.out.println(v);
	}
}

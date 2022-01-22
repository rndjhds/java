package p2022_01_11;

import java.util.*;

public class VectorTest01 {
	public static void main(String[] args) {

		// 4개의 요소를 저장할 수 있는 벡터 객체 생성, 3개씩 증가
		Vector vec = new Vector(4, 3);
		System.out.println("벡터의 크기는 " + vec.size()); // 벡터에 저장된 요소의 개수를 알려줌
		System.out.println("벡터의 용량은 " + vec.capacity());// 벡터의 용량을 반환
		System.out.println(vec.isEmpty());	// true //size가 없어야 true출력
		for (int i = 0; i < 5; i++)
			// add(Object e)
			vec.add(i * 10);	// 0, 10, 20, 30, 40
		System.out.println("벡터의 크기는 " + vec.size());
		System.out.println("벡터의 용량은 " + vec.capacity());
		System.out.println("첫 번째 요소는 " + vec.firstElement());
		System.out.println("두 번째 요소는 " + vec.get(1)); // 0이 첫 번째 요소이므로
		System.out.println("마지막 요소는 " + vec.lastElement()); // 마지막 원소 출력

		System.out.println("\n >> 저장된 요소 전체 출력 <<");

		for (int i = 0; i < vec.size(); i++)
			System.out.print("   " + vec.get(i));
		System.out.println();
	}
}
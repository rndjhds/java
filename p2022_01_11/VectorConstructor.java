package p2022_01_11;

import java.util.*;

public class VectorConstructor {
	public static void main(String[] args) {

		// 기본적인 vector 생성 방법
		Vector vector1 = new Vector();
		System.out.println("size1=" + vector1.size());
		System.out.println("capacity1=" + vector1.capacity());

		// 초기 capacity만 지정한 생성 방법
		Vector vector2 = new Vector(3); // heap메모리에 공간3개를 만든다.
		System.out.println("size2=" + vector2.size());
		System.out.println("capacity2=" + vector2.capacity());

		// vector에 값을 추가
		vector2.add("gemini");
		vector2.add("johnharu");
		vector2.add("gracedew");
		vector2.add("bidon");	// 공간이 부족해도 동적으로 크기를 늘려준다.
		System.out.println("size2=" + vector2.size());
		System.out.println("capacity2=" + vector2.capacity());

		// 초기 capacity와 증가 capacity를 지정한 생성 방법
		Vector vector3 = new Vector(1, 1);	// heap메모리에 공간 1개생성 
		vector3.add("opendb");	//	공간 부족시 1개씩 증가하라는 의미
		System.out.println("size3 = " + vector3.size());
		System.out.println("capacity3=" + vector3.capacity());

		vector3.add("moon");
		System.out.println("size3 = " + vector3.size());
		System.out.println("capacity3=" + vector3.capacity());
	}
}

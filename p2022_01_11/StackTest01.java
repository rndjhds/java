package p2022_01_11;

import java.util.*;

// LIFO(Last Input First Output)구조

public class StackTest01 {
	public static void main(String[] args) {
		Stack myStack = new Stack();
		
		// Stack자료 추가 : push()
		myStack.push("1-자바");
		myStack.push("2-C++");
		myStack.push("3-API");
		myStack.push("4-MFC");

//		System.out.println(myStack.pop()); // 4-MFC
//		System.out.println(myStack.pop()); // 3-API
//		System.out.println(myStack.pop()); // 2-C++
//		System.out.println(myStack.pop()); // 1-자바
//		System.out.println(myStack.pop());	// 비어있을 시 EmptyStackException 예외발생

//		스택 자료구조가 비어있지 않으면
		while (!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
	}
}

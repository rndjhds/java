package homework;

import java.util.Scanner;

class MemberInfo {

	private String name;
	private int age;
	private String email;
	private String address;

	MemberInfo(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;

	}

	void print() {
		System.out.println("성명:" + name + " 나이:" + age + " 이메일:" + email + " 주소:" + address);
	}
}

public class MemberInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("이름:\t");
		String name = sc.nextLine();

		System.out.print("나이:\t"); // nextInt()는 마지막 개행문자(엔터)를 제거하지 않은 채 숫자만 받아 처리한다.
		int age = Integer.parseInt(sc.nextLine()); // 때문에 nextInt() 다음줄에 nextLine()을 쓰면 개행문자가 nextLine()의 입력으로 처리가 되어서
													// 오류가 발생한다.
		// 해결방법1

//		int age = sc.nextInt();
//		sc.nextLine();
//  	해결방법2

		System.out.print("이메일:\t");
		String email = sc.nextLine();

		System.out.print("주소:\t");
		String address = sc.nextLine();

		MemberInfo user = new MemberInfo(name, age, email, address);
		user.print();
	}

}

// 2명이상 입력 하기 만들어보기
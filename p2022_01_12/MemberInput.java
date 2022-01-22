package p2022_01_12;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 제네릭 : 한가지 자료형의 자료만 저장한다는 의미
		// List에 MemberInfo객체만 저장 할 수 있다.
		ArrayList<MemberInfo> li = new ArrayList<MemberInfo>();	
		// 제네릭은 특정 한가지 자료형만 저장할 수 있도록 해준다.
//		li.add(30);	오류 발생 : 자료형이 MemberInfo가 아니기 때문
		MemberInfo mm;
		String yn;

		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("성명을 입력하세요? ");
			String name = sc.nextLine();
			System.out.print("나이를 입력하세요? ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("E-Mail을 입력하세요? ");
			String email = sc.nextLine();
			System.out.print("주소를 입력하세요? ");
			String address = sc.nextLine();

			MemberInfo m = new MemberInfo();
			// m.name="홍길동";
			m.setName(name);
			m.setAge(age);
			m.setEmail(email);
			m.setAddress(address);

//			add(Object e)
			li.add(m);	// 업캐스팅

			System.out.println("계속할려면 y, 멈출려면 n을 입력?");
			yn = sc.next();
			if (yn.equals("y")) {
				continue;
			} else if (yn.equals("n")) {
				break;
			}

		} while (true);

		// Object get(int index)
		for (int i = 0; i < li.size(); i++) {
			mm = (MemberInfo) li.get(i); // 다운 캐스팅	// 제네릭을 썼기 때문에 (MemberInfo)는 생략 가능
				// Object --> MemberInfo로 다운 캐스팅
			System.out.println("성명:" + mm.getName());
			System.out.println("나이:" + mm.getAge());
			System.out.println("E-Mail:" + mm.getEmail());
			System.out.println("주소:" + mm.getAddress());
		}
	}

}

// DTO(Data Transfer Object)
class MemberInfo extends Object {	// 사용자 정의 클래스는 자동으로 Object를 상속받는다.
	private String name; // 필드
	private int age;
	private String email;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

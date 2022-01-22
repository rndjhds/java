package homework;

import java.util.ArrayList;
import java.util.Scanner;

class MemberInput01 {
	private String name;
	private int age;
	private String email;
	private String address;

	public MemberInput01() {

	}

	void Settet(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}

	String nameGetter() {
		return name;
	}

	int ageGetter() {
		return age;
	}

	String emailGetter() {
		return email;
	}

	String addressGetter() {
		return address;
	}
}

public class MemberInputEx {

	public static void main(String[] args) {

		MemberInput01 mi = new MemberInput01();
		ArrayList al = new ArrayList();
		Scanner sc = new Scanner(System.in);

		while (true) {
			
			System.out.print("이름을 입력하세요:");
			String name = sc.nextLine();
			System.out.print("나이를 입력하세요:");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("이메일을 입력하세요:");
			String email = sc.nextLine();
			System.out.print("주소를 입력하세요:");
			String address = sc.nextLine();

			mi.Settet(name, age, email, address);
			
			al.add(mi.nameGetter());
			al.add(mi.ageGetter());
			al.add(mi.emailGetter());
			al.add(mi.addressGetter());
			
			for(int i = 0; i < al.size(); i++) {
				System.out.println(al.get(i));
			}

			System.out.println("계속 입력하시겠습니까?");
			String answer = sc.nextLine();
			if(answer == "y"|| answer == "Y")
				continue;
			if(answer == "n"|| answer == "N")
				break;
		}
	}

}

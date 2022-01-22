package p2021_12_31;

public class Shared {
	public static void main(String[] args) {

		StaticCount sc1 = new StaticCount();
		System.out.println("sc1.number = " + sc1.number); // 3

		sc1.number++;
		System.out.println("sc1.number = " + sc1.number); // 4

		StaticCount sc2 = new StaticCount();
		System.out.println("sc2.number = " + sc2.number); // 4

		sc2.number++;
		System.out.println("sc2.number = " + sc2.number); // 5

		System.out.println(StaticCount.number); // 5
	}
}
// 정적 필드이기 떄문에 static영역(공유영역)에 저장되기 때문에
//sc1,sc2의 주소가 같아서 하나만 값을 변경해도 값이 다 변경된다.
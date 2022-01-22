package p2022_01_13;

// Thread 클래스를 상속받아 Thread를 정의함.

public class Family extends Thread {
	Toilet toilet;
	String who;
	boolean key; // 초기값: false

	// 생성자
	public Family(String name, Toilet t) {
		who = name;	// who = "아버지"
		toilet = t;	
	}

	public void run() {	// 실행 상태(running 상태)
		toilet.openDoor(who, key);
	}
}
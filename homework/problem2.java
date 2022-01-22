package homework;

public class problem2 {

	public static void main(String[] args) {	
		for(int i = 2; i <= 9; i++) {
			System.out.print("["+i+"단]\t");
		}
		System.out.println();
		for (int j = 1; j <= 9; j++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.print(dan + "*" + j + "=" + dan * j+"\t");
			}
			System.out.println();
		}
	
	}

}

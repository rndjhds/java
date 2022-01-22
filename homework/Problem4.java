package homework;

public class Problem4 {

	public static void main(String[] args) {
		int data[] = new int[6];

		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (data[i] == data[j]) {
					i--;
					
				}
			}
		}

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

}

package homework;

public class ArrayGugudan {

	public static void main(String[] args) {
		int[][] dan = new int[8][9];
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 9; j++) {
				dan[i][j] += (i+2)*(j+1);
				System.out.print(dan[i][j]+"\t");
			}
			System.out.println();
		}
	}

}

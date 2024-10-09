package array;

public class Multiplay_Maxtrix {

	public static void main(String[] args) {

		int r1 = 2, c1 = 3;
		int r2 = 3, c2 = 2;
		//r1 = c2
		
		int[][] firstMatrix = {
				{3,-2,5},
				{3,0,4}
		};
		
		int[][] secondMatrix = {
				{2,3,4},
				{23,43,54},
				{32,54,12}
		};
		
		int[][] product = new int[r1][c2];
		
		for(int i = 0; i < r1; i++) {
			for(int j = 0; j < c2; j++) {
				for(int k = 0; k < c1; k++) {
					product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
				}
			}
		}
		
		System.out.println("Multiplication of 2 Matrix is: ");
		
		for(int[] row : product) {
			for(int column : row) {
				System.out.print(column+" ");
			}
			System.out.println();
		}
		
	}

}

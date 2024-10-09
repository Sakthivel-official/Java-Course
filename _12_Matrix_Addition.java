package array;

public class Matrix_Addition {

	public static void main(String[] args) {
		
		//creating 2 matrices
		int a[][] = {
				{1,3,4},
				{2,3,4},
				{3,4,5}
				};
		
		int b[][] = {
				{4,2,6},
				{8,9,1},
				{5,7,2}
				};
		
		//creating another matrix to store the sum of a[][] and b[][]
		System.out.println("Addition of the a & b Arrsy");
		int c[][] = new int[3][3];  
		for(int i = 0; i < 3;i++) {
			for(int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];//use - for Addition
				System.out.print(c[i][j] +" ");
			}
			System.out.println();
		}
		
		System.out.println("Subtraction of the a & b Array");
		int d[][] = new int[3][3];
		for(int i = 0; i < 3;i++) {
			for(int j = 0; j < 3; j++) {
				d[i][j] = a[i][j] - b[i][j];//use - for Addition
				System.out.print(d[i][j] +" ");
			}
			System.out.println();
		}
		
	}

}

package array;

public class _3D_Array {

	public static void main(String[] args) {

		int[][][] cube = new int[2][3][4];
		
		
		//Initializing values
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<4;k++) {
					cube[i][j][k] = i+j+k;
				}
			}
		}
		
		
		

	//Accessing the values
	for(int i=0;i<2;i++) {
		for(int j=0;j<cube[i].length;j++) {
			for(int k=0;k<cube[i][j].length;k++) {
				System.out.print(cube[i][j][k]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
//	
	int[][][] cube1 = 
		{//0    0           1          2
				
			// 0  1  2    0   1  2    0   1  2
			{ {32,54,12},{32,43,12},{324,52,12}},
		//1       0                1
			
			// 0  1  2 3 4   0,   1   2 3     
			{ {324,23,44,2,4},{424,324,42,4,}}
		};
	
	System.out.println(cube1[1][0][1]);
	
	}
}

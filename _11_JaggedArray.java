package array;

public class JaggedArray {

	public static void main(String[] args) {

		//jagged Array
		int[][] jaggedArray = new int[3][];
		
		jaggedArray[0] =new int[] {3,5,1};
		jaggedArray[1] =new int[] {4,8};
		jaggedArray[2] =new int[] {4,8,9};
		
		for(int i = 0; i < jaggedArray.length; i++) {
			for(int j = 0; j < jaggedArray[i].length; j++) {
				System.out.print(jaggedArray[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}

package array;

import java.util.Scanner;

public class Multidimentional_Array {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int[][] array = new int[100][100];
		
		int row, column, i, j;
		
		System.out.print("Enter Number of Row: ");
		row = in.nextInt();
		
		System.out.print("Enter the Number of Column:");
		column = in.nextInt();
		
		for(i=0;i<row;i++) {
			for(j=0;j<column;j++) {
				System.out.printf("Enter the array element: arr[%d][%d]: ",i,j);
				array[i][j] = in.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("Display 2D array Elements ");
		
		for(i=0; i<row; i++) {
			for(j=0; j<column; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}

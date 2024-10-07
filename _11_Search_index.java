package array;

import java.util.Scanner;

public class Search_index {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n;
		
		System.out.println("Enter no. of element you want it: ");
		n = in.nextInt();
		
		System.out.println("Enter all the element: ");
		int arr[] = new int[n];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.println("Enter the index to find: ");
		int k = in.nextInt();
		
		System.out.println("The element is: "+ arr[k-1]);
		
		in.close();
		
	}

}

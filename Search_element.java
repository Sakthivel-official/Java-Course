package array;

import java.util.Scanner;

public class Search_element {

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
		
		System.out.println("Enter the element you want to find:");
		int num = in.nextInt();
		int flag = 0;
		
		int i = 0;
		for(i=0;i<arr.length;i++) {
			if(arr[i] == num) {
				flag = 1;
				break;
			}
			else {
				flag = 0;
			}
		}
		
		if(flag == 1)
		{
			System.out.println("Element found at the position: "+ (i+1));
		}
		else {
			System.out.println("Element not found :(");
		}
		
		in.close(); 
	}

}

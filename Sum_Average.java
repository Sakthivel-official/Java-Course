package array;

import java.util.Scanner;

public class Sum_Average {

	public static void main(String[] args) {
		
		int n;
		int sum = 0;
		float average;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		n = in.nextInt();
		int[] arr = new int[n];  //Decalaring an array using elements 
		System.out.println("Enter all element");
		
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt(); //arr[0] = input...1...2....3....size-1
			sum = sum + arr[i];
		}
		
		average = (float) sum/n; //type Casting
		
		System.out.println("The Sum of Array Element: "+sum);
		System.out.println("The Average of Array Element: "+average);
		
		in.close();
	}

}

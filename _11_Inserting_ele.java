package array;

import java.util.Arrays;
import java.util.Scanner;

public class Inserting_ele {

	private static int[] insertElement(int size, int[] arr, int element, int pos) {
		
		int newarr[] = new int[size+1];  // the new array size is = old array size + 1;
		
		for(int i=0;i<size+1;i++) { 	
			if(i<pos-1) 
				newarr[i] = arr[i];
			else if(i == pos-1)
				newarr[i] = element;
			else
				newarr[i] = arr[i-1];
		}
		
		return newarr;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the Size of Array: ");
		int size = in.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements");
		
		for(int i=0;i<size;i++) {
			System.out.print("Enter "+i+" Element: ");
			arr[i] = in.nextInt();
		}
		
		System.out.println("An Array: "+Arrays.toString(arr));
		System.out.print("Enter the Element to Insert: ");
		int element = in.nextInt();
		
		System.out.print("Enter the Positon: ");
		int pos = in.nextInt();
		
		// int size = 3;
		// int[] arr = {2,4,7,5};
		// int element = 8;
		// int pos = 3;
		
		int[] afterinserted = insertElement(size,arr,element,pos);
		System.out.println("The New Array is: "+Arrays.toString(afterinserted));
		
		in.close();
	}


}

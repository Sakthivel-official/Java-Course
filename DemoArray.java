package array;

//1.Write a Java program to reverse an array of integer values.
//2.Write a Java program to find common elements between two integer arrays.
//3.Write a Java program to find the number of even and odd integers in a given array of integers.
//4. Write a Java program to find the largest of two nos

public class DemoArray {

	public static void main(String[] args) {

		int[] arr = new int[5];
		
		arr[0] = 12;
		arr[1] = 22;
		arr[2] = 32;
		arr[3] = 42;
		arr[4] = 52;
		
		System.out.println("-------using for loop----------");
		for(int i=0;i<arr.length;i++) {
			System.out.println("The Element at Index: "+ i +" is: "+arr[i]);
		}

		System.out.println("---------using for-each loop----------");
		for(int val:arr) {
			System.out.println("The Element is: "+val);
		}
		
		
	}

}

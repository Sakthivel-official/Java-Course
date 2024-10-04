package array;

public class Passing_Array {

	static void min(int[] arr) {//passing array to the method
		
		int min = Integer.MAX_VALUE;
		int index = 0;
		
		for(int i=0;i<arr.length;i++) { 
			if(min > arr[i]) {
				min = arr[i];
				index = i;
			}
		}
			System.out.println("The Minium Value is: "+min);
			System.out.println("The Index is: "+index);
			
		
	}
	public static void main(String[] args) {

		int[] a = {3,4,5,6,12,2};//declaring and initializing an array
		min(a);//passing array to method
		
	}


}

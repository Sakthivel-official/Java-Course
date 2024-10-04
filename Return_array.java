package array;

import java.util.Arrays;

public class Return_array {

	static int[] get() {
		return new int[] {23,421,23,12,3};
	}
	
	public static void main(String[] args) {

		int[] arr = get();
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("The element at index: "+i+" is: "+arr[i]);
//		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}

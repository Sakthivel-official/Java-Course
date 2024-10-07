package array;

public class PatternProgram {

	public static void main(String[] args) {

		int row = 6;
		
		//outter for loop for row
		for(int i = 0; i < row; i++) {
			//inner for loop for column
			for(int j = 0; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i < row; i++) {
			for(int j=row; j >i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//outer for loop 
		for(int i = 0; i < row; i++) {
			//inner for loop for column
			for(int j = 0; j < i ; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		
		
		
		
	}

}

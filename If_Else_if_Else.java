import java.util.Scanner;

public class If_Else_if_Else {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		System.out.print("Enter You Mark: ");
		int mark=in.nextInt();
		
		if(mark>100) 
			System.out.println("Please Enter Your Correct/Mark less than 100");
		else if(mark>90 && mark<=100)
			System.out.println("You are O grade");
		else if(mark<=90 && mark>=80) 
			System.out.println("You are A grade");
		else if(mark<80 && mark>=75) 
			System.out.println("You are B grade");
		else if(mark<75 && mark>=50)
			System.out.println("YOu are C grade");
		else if(mark<50 && mark>30) 
			System.out.println("You are D grade");
		else
			System.out.println("You are Fail");
		
		in.close();
		
	}

}

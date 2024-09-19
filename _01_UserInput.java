import java.util.Scanner;

public class _01_UserInput {

	public static void main(String[] args) {
	
		Scanner in=new Scanner(System.in);  //Scanner is used to take input from user
		
		System.out.print("Enter a Number: ");
		int a=in.nextInt();    //nextInt is used to get input as Integer only
		System.out.println("The Number is: "+a);
		System.out.print("Enter a String: ");
		in.next();   //after integer we use the next() or nextline() for getting String as input
		String str=in.nextLine();  // nextLine is used to get input as String
		System.out.println("The String: "+str);

	}

}

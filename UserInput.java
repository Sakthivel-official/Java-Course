import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
	
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int a=in.nextInt();
		System.out.println("The Number is: "+a);
		System.out.print("Enter a String: ");
		in.next();
		String str=in.nextLine();
		System.out.println("The String: "+str);

	}

}

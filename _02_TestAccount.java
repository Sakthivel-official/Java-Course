import java.util.Scanner;

public class _02_TestAccount.java {

	public static void main(String[] args) {

//		Account a1=new Account();
//		a1.insert(1389144422, "Sakthivel", 0);
//		a1.deposit(2000);
//		a1.checkBalance();
//		a1.withdraw(1000);
//		a1.checkBalance();
//		a1.withdraw(2000);
		
		Scanner in=new Scanner(System.in);
		
		Account a2=new Account();
		int userinput=0;
		String exit;
		System.out.println("First you need to Create/Add Account ->>");
		
		do {
		    System.out.println("\n1.Add Account\n2.Deposit\n3.CheckBalance\n4.Withdraw\n5.Account Details\n");
			
	            try {
			userinput=in.nextInt();
		     }
		    catch(Exception e) {
			System.err.println("Please Enter a Number(1/2/3/4)");
		     }
			
		switch(userinput) {
		
			case 1:
				System.out.print("Enter Account Number: ");
				int ac_no=in.nextInt();
				
				System.out.print("Enter Account Name: ");
				String nam=in.next();
				
				System.out.print("Enter Initial Amount: ");
				float amt=in.nextInt();
				a2.insert(ac_no, nam, amt);
				break;
			case 2:
				System.out.print("Enter amount to Deposit: ");
				int depositamt=in.nextInt();
				
				a2.deposit(depositamt);
				break;
			case 3:
				a2.checkBalance();
				break;
			case 4:
				System.out.println("Enter Amount to Withdraw: ");
				float withamt=in.nextInt();
				a2.withdraw(withamt);
				break;
			case 5:
				a2.display();
				break;
			
			default:
				System.out.println("Enter Valid Number to Process >>");
				
		}
		
		System.out.print("\nYou want to Exit (y/n) " );
		exit=in.next().toLowerCase();
				
		}while(!exit.equals("y"));
		
		System.out.println("Exited!!");
		
		in.close();
	}

}


class Account{
	int acc_no;
	String name;
	float amount;	
	
	void insert(int acno,String nam,float amt) {
		acc_no=acno;
		name=nam;
		amount=amt;
	}
	
	void deposit(float amt) {
		amount+=amt;
		System.out.println("\n+------------------------+");
		System.out.println(amt+ " deopsited");
		System.out.println("+------------------------+");
	}
	
	void withdraw(float amt) {
		if(amount<amt) {
			System.out.println("\n+------------------------+");
			System.out.println("Insufficient Balance"+"\nAvailable Balance is: "+amount);
			System.out.println("+------------------------+");
		}
		else {
			amount-=amt;
			System.out.println("\n+------------------------+");
			System.out.println(amt+ " withdrawen");
			System.out.println("+------------------------+");
		}
	}
	
	void display() {
		System.out.println("\n+------------------------+");
		System.out.println("Account Details are");
		System.out.println("+------------------------+");
		System.out.println("Account Number: "+acc_no);
		System.out.println("Name: "+ name);
		System.out.println("Amount: "+amount);
	}
//	method to check balance
	void checkBalance() {
		System.out.println("\n+------------------------+");
		System.out.println("Balance is: "+amount);
		System.out.println("+------------------------+");
	}
}



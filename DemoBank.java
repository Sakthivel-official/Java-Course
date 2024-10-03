package abstraction;

abstract class Bank{
	abstract double getInterest();
}

class SBI extends Bank{
	double getInterest() {//method overriding
		return 7.2;
	}
}

class UNION extends Bank{
	double getInterest() {  //method overriding
		return 8.2;
	}
}

public class DemoBank {
	public static void main(String[] args) {

		Bank b; // we can create object for subclasses only
		
		b = new SBI();
		System.out.println("Rate of Interest(SBI) is: "+b.getInterest()+"%");
		
		b = new UNION();
		System.out.println("Rate of Interest(UNION) is: "+b.getInterest()+"%");		
		
	}
}

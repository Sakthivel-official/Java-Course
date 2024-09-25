
public class NormalMethod {
	
	static int a = 10;
	int b = 20;
	
	//1. to print add two numbers using static method 
	//2. to print two numbers using public method
	
	void display() {
		System.out.println(a);
		System.out.println(b);
	}
	
	static void staticdisplay() {
		System.out.println(a);//static method kull static variables ah mattum the use pana mudiyum
	}
	
	public static void main(String[] args) {
		NormalMethod nm = new NormalMethod();	
		nm.display();
		
		//static method directly call the method 
		staticdisplay();//no need to call the obj explicitly
	}

}

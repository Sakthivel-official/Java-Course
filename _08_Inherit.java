package inheritance;

class One{//Base class,super class,parent class
	
	public void printOne() {
		System.out.println("Print One");
	}
}

class Two extends One{//derived class,sub class,child class, extends - used to inherit the class
	public void printtwo() {
		System.out.println("Print Two");
	}
}

public class Inherit {
	public static void main(String[] args) {

		Two t1 = new Two();
		t1.printOne();
		t1.printtwo();
		
	}
}

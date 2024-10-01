package inheritance;

//Multiple inheritance acheive from inheritance 
interface One1{  // interface can't have a body of method , methods only have a declaration
	public void one();
}

interface Two1{
	public void two();  
}

interface Three extends One1,Two1{
	public void three();
}

class Child implements Three{
	@Override
	public void one() {
		System.out.println("Print one from Class: One");
	}
	public void two() {
		System.out.println("Print two from class: two");
	}
	public void three() {
		System.out.println("Print three from class: three");
	}
}

public class Multiple {

	public static void main(String[] args) {

		Child c1 = new Child();
		c1.one();
		c1.two();
		c1.three();
		
	}

}

package inheritance;

class Inheritance{
	float salary = 60000; //base class data field
}

public class SingleInheritance extends Inheritance {

	int bonus = 3000; //derived class data field
	public static void main(String[] args) {

		SingleInheritance s = new SingleInheritance();
		System.out.println("The Salary is: "+s.salary);
		System.out.println("The Bonus is: "+s.bonus);
		
	}

}

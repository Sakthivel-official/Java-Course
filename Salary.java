
public class Salary extends Employee {
	
	private double salary;//Annual Salary
	
	Salary(String name, String address, int number, double salary){
		super(name,address,number); //invoke the super class constructor
		this.salary = salary;
	}
		
	public void mailCheck() {
		System.out.println("----------------------------------------");
		System.out.println("Within mailCheck of Salary class");
		System.out.println("Mailing check to "+getName());
		System.out.println("----------------------------------------");
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double newsalary) {
		if(newsalary >= 0) 
			this.salary = newsalary;
	}
	
	public double computePay() {
		System.out.println("----------------------------------------");
		System.out.println("Computing salary pay for "+getName());
		System.out.println("----------------------------------------");
		return salary/52;
	}
	
	public static void main(String[] args) {
		
		//1. write a program in abstract class to create class shape with abstract calculate area and primeter ,create subclasses 
		//    circle and triangle and implement respective method  

		Employee e1 = new Employee("Sakthi","chennai",34);
		e1.computePay();
		e1.mailCheck();
		System.out.println(""+e1.computePay());
		
		Employee s1 = new Salary("ramana","chennai",65,30000);
		s1.mailCheck();
		s1.setName("Ramana Raja");
		s1.mailCheck();
		System.out.println(""+s1.computePay());
		
		
	}

}

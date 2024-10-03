
public class Employee {

	private String name;
	private String address;
	private int number;
	
	public Employee(String name, String address, int number) {
		System.out.println("Constructing an Employee");
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public double computePay() {
		System.out.println("Inside Employee computePay");
		return 0.0;
	}
	
	public void mailCheck() {
		System.out.println("-----------------------------------------------");
		System.out.println("Mailing a check to "+this.name+" "+this.address);
		System.out.println("-----------------------------------------------");
	}
	
	public String toString() {
		return name+" "+address;
	}
	
	//Getters and Setters
	public void setName(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String newadd) {
		address = newadd;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setNumber(int num) {
		number = num;
	}
	public int getNumber() {
		return number;
	}
	
}


public class Employee {
	private String name;
	private int age;
	private String department;
	
	private Employee(String name,int age,String department) {
		//this referes to current class fields because here parameters and fields are same name
		this.name = name;
		this.age = age;
		this.department = department;
	}
	
	//factory method to create employee objects - "new Employee"
	public static Employee createEmp(String name,int age,String department) {  // here we createing a method that must return Employee 
		return new Employee(name,age,department);
	}
	
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Department: "+department);
	}
	
	public static void main(String[] args) {
		
		Employee e1 = Employee.createEmp("Sakthivel", 19, "Development");
		Employee e2 = Employee.createEmp("Ramana", 12, "Development");
		
		System.out.println("Employee 1 - Name: "+e1.name+", Age "+e1.age+", Departement: "+e1.department);
		System.out.println("Employee 1 - Name: "+e2.name+", Age "+e2.age+", Departement: "+e2.department);
		
		e1.display();
		
	}

}

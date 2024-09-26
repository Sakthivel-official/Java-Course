
public class DefaultConstructor {
	int val1;
	int val2;
	
	
	//1. write a program to print employee details using constructor(empid,empname,empsal,empage,empdistioga);
	//2. create a class dog with instance variable name,color. implement a parameterized that takes name,color as parameter and initialize the instance variable
	//   print the values the variable
	
	
	
	//default constructor - same name as class name
	DefaultConstructor(){
		val1 = 10;
		val2 = 20;
	}
	public void display() {
		System.out.println("Value1 :"+val1);
		System.out.println("Value2 :"+val2);
	}
	
	public static void main(String[] args) {

		//constructor is invoked while
		//creating an object of class
		DefaultConstructor con = new DefaultConstructor();
		DefaultConstructor con1 = new DefaultConstructor();
	
		con.display();
		con1.display();
	}

}

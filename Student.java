
public class Student {
	int id;
	String name;
	
	//default constructor
	Student(){
		
	}
	//parameterized constructor
	Student(int d,String n){
		id = d;
		name = n;
	}
	
	//constructor overloading
	Student(int d){
		id = d;
	}
	
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {	
		Student s1 = new Student(23, "Sakthivel");
		Student s2 = new Student(24, "Ramana");
		Student s3 = new Student(25, "Saravanan");
		Student s4 = new Student(27);
		Student s5 = new Student();
		
		s1.display();
		s2.display();
		s3.display();
	}

}

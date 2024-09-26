
public class ConsOverloading {
	int id;
	String name;
	int age;
	
	//constructor overloading we create two or more constructor ,but parameter is different
	ConsOverloading(int d,String n){
		id = d;
		name = n;
	}
	ConsOverloading(int d,String n,int a){
		id = d;
		name = n;
		age = a;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+age);
	}
	
	
	public static void main(String[] args) {
		
		ConsOverloading s1 = new ConsOverloading(23,"Sakthi");
		ConsOverloading s2 = new ConsOverloading(24,"Sakthivel",19);
		
		s1.display();
		s2.display();

	}

}

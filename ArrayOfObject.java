package array;

class Student{
	public int id;
	public String name;
	Student(int id,String name){
		this.id = id;
		this.name = name;
	}
	public void display() {
		System.out.println("Student id id: "+id+" Name is: "+name);
	}
}

public class ArrayOfObject {

	public static void main(String[] args) {

		Student[] arr;
		arr = new Student[3];
		
		System.out.println("Student data in arr[0]");
		arr[0] = new Student(12,"Sakthivel");
		arr[0].display();
		System.out.println("Student data in arr[1]");
		arr[1] = new Student(14,"Ramana");
		arr[1].display();
		System.out.println("Student data in arr[2]");
		arr[2] = new Student(15,"Saravanan");
		arr[2].display();
		
//		System.out.println("The Array of Objects is: "+Arrays.toString(arr));
		
	}

	
	
}

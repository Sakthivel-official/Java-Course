
public class Method { // A method is a block of code which only runs when it is called
		      // To reuse code: define the code once & use it many times
	static void display(String name) {
		System.out.println(name+" :is my course");
	}

	public static void main(String[] args) {
		Method.display("c");
		Method.display("Java");
		Method.display("Python");
	}

}

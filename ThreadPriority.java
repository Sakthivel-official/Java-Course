
public class ThreadPriority {

	public static void main(String[] args) throws InterruptedException {

		Thread ex1 = new Thread("Demo1");
		Thread ex2 = new Thread("Demo2");
		
		ex1.start();
		ex2.start();
//		ex1.join();
//		ex2.join();
		
		System.out.println("Thread name area as follows");
		System.out.println(ex1.getName());
		System.out.println(ex2.getName());
		
	}
	
	public void run() {
		System.out.println("Inside the Run");
	}

}

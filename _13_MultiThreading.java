//thread is process that allows the program a program more efficiently 
//multiple thing at the same time
//thread can me implemented two ways
//extends Thread (class)
//implements runnable (interface)
public class MultiThreading extends Thread {
	
	//life cycle of thread
	//1. new(constructing) starting the rhread by initializing the 
	//2.Runnable (prepated to execute the code in interface)
	//3.Running (thread for execution with/without time slot)
	
	public static void main(String[] args) {
		
		MultiThreading t1 = new MultiThreading();
		t1.start();
		
		System.out.println("The code is outside the thread");
		

	}
	public void run() {
		System.out.println("The code is inside the thread");
	}

}

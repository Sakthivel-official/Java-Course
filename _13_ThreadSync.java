
public class ThreadSync {
	
	private final String name;
	
	//different between join() and sleep()
	
	//join() - method in java allows one thread to wait until anothre thread completes its execution
				
		//joins is a synchorinized method block the calling the until the thread whose join method is called has completed
	//sleep() - method in java temprarly suspense the currently running thread for a specified duration - can be specified in millisec(ms)
				//keeps the lock or moniter if thread is waiting 
	
	public ThreadSync(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public synchronized void call(ThreadSync caller) {
		System.out.println(this.getName() + " Has asked to call Me! "+caller.getName());
		
		try {
			Thread.sleep(5);//500 millisec (ms)
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		caller.call(this);
	}
	
	public synchronized void callMe(ThreadSync caller) {
		System.out.println(this.getName()+" Has asked to call Me! "+caller.getName());
	}
	
	
	public static void main(String[] args) {

		ThreadSync caller1 = new ThreadSync("Caller-1");
		ThreadSync caller2 = new ThreadSync("Caller-2");
		
		new Thread(new Runnable() {
			public void run() {
				caller1.call(caller2);
			}
		}).start();
		
		
		
	}

}

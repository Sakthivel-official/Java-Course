
public class ThreadJoin extends Thread {

	int number;
	ThreadJoin(int number){
		this.number = number;
	}
	
	public void run() {
		
		for(int i = 1; i <= number; i++) {
			
			try {
				Thread.sleep(300);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {

		int n = 10;
		
		ThreadJoin t1 = new ThreadJoin(n);
		ThreadJoin t2 = new ThreadJoin(n);
		ThreadJoin t3 = new ThreadJoin(n);
		
		t1.start();
		
		try {
			t1.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		t2.start();
//		try {
//			t2.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		t3.start();
	}

}

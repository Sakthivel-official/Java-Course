
class Book implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Do the Task");
	}
	
}

//what is deadlock?
//deadlock -- locking the object ( "synchronized" keyword is used to met the class or method thread safe
//which means only one thread can have the lock of a synchronized mothod and other thread have to wait
//till the lock releases)

//	if our program is running in a multithreaded environment where two or more thread execute
//    symontanicly but somtimes it also causses a problem called deadlock

//ex: ticket booking two or more at the same time

public class ThreadRunable  {
	
	public static void main(String[] args) {

		Thread t1 = new Thread(new Book(),"Book thread");
		
		t1.start();
		System.out.println("Thread with Name: "+t1.getName());
		
	}


}

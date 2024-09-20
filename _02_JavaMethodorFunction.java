
public class _02_JavaMethodorFunction {

//		static returntype functionname
	static void myStaticMethod() {
		System.out.println("Static methods can be called without creating object");
	}
	
	
//	public returntype functionname
	public void myPublicMethod() {
		System.out.println("Public methods must be called by creating method");
	}
	
	
	public void pupAge() {
		int age=0;
		age+=7;
		System.out.println("Puppy age is: "+age);
	 }
	
	
	public static void main(String[] args) {

	myStaticMethod();  //call the static method
	
//	myPublicMethod(); cann't be access
	
	_02_JavaMethodorFunction funobj=new _02_JavaMethodorFunction(); //creating an object 
	
	funobj.myPublicMethod(); //call the public method on the object
		
	
	_02_JavaMethodorFunction funobj1=new _02_JavaMethodorFunction(); //creating an object 

	funobj1.pupAge();  //call the pupAge() method
	
		
	}

}

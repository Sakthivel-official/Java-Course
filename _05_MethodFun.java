
public class MethodFun {
	
	//static methods ah direct ah use panikalam main la
	private static int getSquare(int x) {  
		return x*x;
	}

	public static void main(String[] args) {
		
		//access modifier returntype funname(int,int,String)
		//public void func(int,int)
		//void func(double)
		//void func(int)
		
		for(int i=1;i<=5;i++) {
			//Direct Mtethod call
			int Square = getSquare(i);
			System.out.println("Square of "+i+" is :"+Square);
		}
		
		//Method call using object
		MethodFun fun = new MethodFun();
		
		int ans = fun.getSquare(20);   
		System.out.println("Calling the functio using Object: "+ans);
	}

}

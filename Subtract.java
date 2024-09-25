
public class Subtract {
	
	
	//int return type
	public int subtract(int a,int b) {
		int sub = a - b;
		return sub;
	}

	public static void main(String[] args) {

		Subtract obj = new Subtract();
		
		int num1 = 44;
		int num2 = 40;
		int ans = obj.subtract(num1, num2);
		System.out.println(ans);
	}

}

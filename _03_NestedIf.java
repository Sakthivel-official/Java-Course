
public class _03_NestedIf {

	public static void main(String[] args) {

		int age=21;
		int weight=40;
		
		if(age>=20) {
			if(weight>=50) 
				System.out.println("You are Eligible to denote blood");
			else
				System.out.println("You Weight is less than 50");
		}
		else
			System.out.println("You age is Less than 20 ");
		
	}

}

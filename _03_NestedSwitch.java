
public class _03_NestedSwitch {

	public static void main(String[] args) {

		char branch='M';
		int collegeYear=4;
		
		switch(collegeYear) {
		
		case 1:
			System.out.println("English, Maths, Science");
			break;
		case 2:
			switch(branch) {
			
			case 'C':
				System.out.println("Operating System, Java, Data Structure");
				break;
			case 'E':
				System.out.println("Microprocessor, Logic switching");
				break;
			case 'M':
				System.out.println("Manufacturing machine");
				break;    
			}
			break;  //break the case 2 !important ...ilana case3'um run aagum
		case 3:
			switch(branch) {
					
			case 'C':
		    	System.out.println("Computer Organization");
		    	break;
		    case 'E':
				System.out.println("Electronic & Embedded Enginerring");
				break;
		    case 'M':
		    	System.out.println("Machanical Department");
			   	break;
			}
			break;
		default:
			System.out.println("Please Enter a Correct Year!!");
			
		}
		
	}

}

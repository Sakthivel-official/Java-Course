
public class _03_SwitchString {

	public static void main(String[] args) {

		String levelString="Intermediate";
		int level=0;
		
		switch(levelString) {
			case "Beginer": level=1;
				break;
			case "Intermediate": level=2;
				break;
			case "Expert": level=3;
				break;
			default: level=0;
		}
		
		System.out.println("Your level is: "+level);
		
	}

}

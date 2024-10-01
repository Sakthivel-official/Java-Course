package inheritance;


//base class
class One3{
	public void one() {
		System.out.println("I am From class One");
	}
}

//intermediatory class
//child class two extends One , parent class for three
class Two3 extends One3{
	public void two() {
		System.out.println("I am from class Two");
	}
}

//child class three inherits from class two , two is parent class for three
class Three3 extends Two3{
	public void three() {
		System.out.println("I am from class Three");
	}
}

public class Multilevel {

	public static void main(String[] args) {

		Three3 t1 = new Three3();
		t1.one();
		t1.two();
		t1.three();
				
	}
}

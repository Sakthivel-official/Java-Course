package abstraction;


abstract class Shape{
	abstract void draw();//abstract method
	public void info() {//concrete method
		
	}
}

//In scenario, implementation 
class Rectangle extends Shape{
	
	@Override
	void draw() {
		System.out.println("Drawing Rectangle");
	}
	
}


//
class Circle extends Shape{
	
	@Override
	void draw() {
		System.out.println("Drawing Circle");
	}
	
	@Override
	public void info() {
		System.out.println("Info Details");
	}
}

//In real senario, method is called by programmer or user
public class DemoAbstract {
	public static void main(String[] args) {
		
		Shape s1 = new Rectangle();
		s1.draw();
		
		Shape c1 = new Circle();//IN a real Senario, object is provided the
		c1.draw();
		c1.info();
	}
}

abstract class Shape {

	
	abstract void draw();
	
	

}
class Line extends Shape{

	
	void draw() {
	System.out.println("Drawing a Line");
	}
	

}
class Rectangle extends Shape {

	
	void draw() {
		System.out.println("Drawing a Rectangle");
		
	}

}
class Cube extends Shape{

	
	void draw() {
		System.out.println("Drawing a Cube");
		
	}

}
public class Testabstract {

	public static void main(String[] args) {
		Shape s = new Line();
		s.draw();
		Shape sp = new Rectangle();
		sp.draw();
		

	}

}

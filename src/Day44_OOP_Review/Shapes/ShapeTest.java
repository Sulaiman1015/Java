package Day44_OOP_Review.Shapes;

public class ShapeTest {

	public static void main(String[] args) {
		//create 2 shapes, using polymorphism,
		
		Shape square = new Square();
		Shape diamont = new Diamont(); 
		Object shapeObject = new Shape();
		
		square.draw();
		diamont.draw();
		
		((Square)square).squareMethod();
		

	}

}

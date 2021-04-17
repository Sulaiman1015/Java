package Day44_OOP_Review.Shapes;

import java.util.List;

public class ShapeManager {
	
	public static Shape buildShape(String type) {
		
		Shape shape = null;
		
		switch(type.toLowerCase()){      
		
		case"shape":
			shape = new Shape();
			break;
		case"diamont":
			shape = new Diamont();
			break;	
		case"square":
			shape = new Square();
			break;
		
	}
		return shape;

	}
	
	public static void drawSquare(Square squareObject) {
		squareObject.draw();
	}
	public static void drawShape(Shape shapeObject) {
		shapeObject.draw();
	}
	public static void drawShape(List<Shape> shapeList) {
		for(Shape each : shapeList) {
			each.draw();
		}
		
	}

}

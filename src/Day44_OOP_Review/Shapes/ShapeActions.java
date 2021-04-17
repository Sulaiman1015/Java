package Day44_OOP_Review.Shapes; 

import static Day44_OOP_Review.Shapes.ShapeManager.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeActions {

	public static void main(String[] args) {
		
		drawShape((Diamont)buildShape("diamont"));
		
		drawShape((Square)buildShape("square"));
		
		
		drawShape(buildShape("shape"));
		
		
		System.out.println("--------------------");
		List<Shape> myList = new ArrayList<>();
		//myList.add(new Shape());
		//myList.add(new Square());
		myList.add(new Shape());
		myList.add(new Square());
		myList.add(new Diamont());
		
		drawShape(myList);

	}

}

package Day43_Polymorphism;

public class ShapArray {

	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[3];
		
		shapes[0]=new Square();
		shapes[1]=new Triangle();
		shapes[2]=new Circle();
		
		for(Shape sh:shapes) {
			//sh.draw();
			
			//System.out.println(sh.getClass().getName());
			
			System.out.println(sh.getClass().getSimpleName());
		}
		
	}

}

package Day17_classeObjects;

public class BMW {
    String make="BMW";
	String model;
	String color;
	double price;
	
	public void showPric() {
		switch(model) {
		case"330i":
			price=40250;
			break;
		case"740i":
			price=85000;
			break;
		case"X3":
			price=65000;
			break;
		default:
			System.out.println(model+" is not available");
		}
		System.out.println("Price: "+price);
	}
}

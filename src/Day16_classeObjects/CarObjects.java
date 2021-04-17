package Day16_classeObjects;

public class CarObjects {

	public static void main(String[] args) {
		CAR Car1=new CAR();
		
		//Car1.printCarinfo();
		
		Car1.make="BMW";
		Car1.model="X3";
		Car1.color="white";
		Car1.currentSpeed=200;
		
		
		Car1.printCarinfo();
		Car1.showCurrentSpeed(180);
		Car1.drive();
		
		System.out.println("before: "+Car1.currentSpeed);
		Car1.accelerate(20);
		System.out.println("after: "+Car1.currentSpeed);
	}

}

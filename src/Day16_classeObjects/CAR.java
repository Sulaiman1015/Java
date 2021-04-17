package Day16_classeObjects;

public class CAR {
	String make;
	String model;
	int currentSpeed;
	String color;
	//int speedLimit;
	
	public void printCarinfo() {
		String info="Car make[" + make + "],model[" + model + "],color[" + color +
				"],current speed[" + currentSpeed + "]";
		System.out.println(info);
	}
	
    public void showCurrentSpeed(int speedLimit) {
    	
		if(currentSpeed<=speedLimit) {
			
			System.out.println(make + " is driving at " + currentSpeed + " mph,folowing the speed limit-" + speedLimit);
		}else {
			System.out.println(make + " is driving at " + currentSpeed + " mph,over the speed limit-" + speedLimit );
		}
		
	}
	
	public void drive() {
		
		System.out.println(make + " " + model + " is driving...");
		
	}
	
	public void accelerate(int mph) {
		
		currentSpeed = currentSpeed + mph;
	}
}	
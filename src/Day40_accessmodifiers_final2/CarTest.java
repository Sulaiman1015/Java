package Day40_accessmodifiers_final2;

import Day40_accessmodifiers_final.Car;

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car(); 
			
			//c.model = "m3";
			c.year = 2017;
			//c.door = 4;
			//c.engine = 5.2;
			
			System.out.println(c.toString());

	}

}

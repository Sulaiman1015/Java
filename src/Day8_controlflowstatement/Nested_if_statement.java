package Day8_controlflowstatement;

public class Nested_if_statement {

	public static void main(String[] args) {
		
		boolean isRushHour=false;
		int carType=1;
		double price=0.0;
		
		if(carType==1) {
			if(isRushHour) {
				price=30.0;
				
			}else {
				price=5.99;
				
			}
		}else {
			price=15.99;
		}
		System.out.println("Toll Cost: "+price);

	}

}

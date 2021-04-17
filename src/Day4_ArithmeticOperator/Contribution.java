package Day4_ArithmeticOperator;

public class Contribution {

	public static void main(String[] args) {
		/* This is program calculates the amount of pay that will 
		be contribution to a retirement plan if 5%, 8% or 10% of 
		monthly pay is withheld
		*/
		
		double monthlyPay=6000;
		double contribution;
		
		//5% Contribution
		contribution=monthlyPay*0.05;
		System.out.println("5% is $ "+contribution+" per monthe");
		
		//8% Contribution
		contribution=monthlyPay*0.08;
		System.out.println("8% is $ "+contribution+" per monthe");
		
		//10% Contribution
		contribution=monthlyPay*0.10;
		System.out.println("10% is $ "+contribution+" per monthe");
		
		
		System.out.println(3-4*2+2);

	}

}

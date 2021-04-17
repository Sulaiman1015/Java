package Day4_ArithmeticOperator;

//This program calculates hourly wages plus overtime

public class Wages {

	public static void main(String[] args) {
		
		double regularWage; // the calculated regular wage
		double basePay = 25.75; //The base pay
		double regularHours=40; //The hours worked less overtime
		double overTimeWages;//Overtime wages
		double overTimePay=37.5;//Overtime pay rate
		double overTimeHours=15;
		double totalWage; //Total Wage
		
		regularWage=basePay*regularHours;
		overTimeWages=overTimePay*overTimeHours;
		
		totalWage=regularWage+overTimeWages;
		System.out.println("Wages for this week are $ "+totalWage);
			
		

	}

}

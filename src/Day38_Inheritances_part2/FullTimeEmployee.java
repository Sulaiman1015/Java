package Day38_Inheritances_part2;

public class FullTimeEmployee extends Employee{
	@Override
	public void calculatePay(int hours, double rate) {
		
		double total = (hours*rate)*1.05;
		System.out.println("FullTime Employee Total Pay:"+total);
	}
	

}

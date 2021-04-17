package Day38_Inheritances_part2;

public class Contructor extends Employee{
	@Override
	public void calculatePay(int hours,double rate) {
		double total = (hours * rate)+200;
		System.out.println("Contructor Total Pay:" + total);
	}
 

}

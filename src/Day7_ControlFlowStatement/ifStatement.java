package Day7_ControlFlowStatement;

public class ifStatement {

	public static void main(String[] args) {
		
		int score = 60;
		if (score>=70) {
			
		
		
			
		System.out.println("Excellent");
		System.out.println("You passed with grade A");
		
		}
		
		System.out.println("*************");
		
		int sales=5000, bonnus=500;
		double commisionRate, salary=10000;
		
		
		
		if(sales>=5000) {
			bonnus=500;
			commisionRate=1.12;
			
			salary=salary*commisionRate+bonnus;
		}
		System.out.println("Salary = " + salary);
		

	}

}

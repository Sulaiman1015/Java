package Day4_ArithmeticOperator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// Addition +
		System.out.println(55+5);
		
		int Chairs=140;
		System.out.println(Chairs + 2);
		
		Chairs=Chairs+2;
		
		int moreChairs=Chairs+5;
		System.out.println(moreChairs);
		
		System.out.println(10%3);
		
		int tables=130;
		int total=tables+Chairs;
		System.out.println(total);
		
		
		//Subtraction -
		double balance = 1200.50;
		double transaction = 56.44;
		System.out.println(balance-transaction);
		balance=balance-transaction;
		System.out.println(balance);
		
		//Create a variable linesOfCode and assign 50 an print "Lines of code 50"
		//delete 2 lines
		//decrease the value
		
		int linesOfCode = 50;
		System.out.println("lines of code "+linesOfCode);
		
		linesOfCode=linesOfCode-2;
		System.out.println("lines of code "+linesOfCode);
		
		//Multiplication *
		System.out.println(22*2);
		
		int classes = 5;
		System.out.println(linesOfCode*classes);
		int totalLinesOfCode=linesOfCode * classes;
		System.out.println("total lines of code = "+totalLinesOfCode);
		
		//Division /
		System.out.println(10/2);
		System.out.println(60/3);
		//System.out.println(11/0);// Error running the code
		
		//Remainder %
		System.out.println(10%2);
		System.out.println(9%2);
				

	}

}

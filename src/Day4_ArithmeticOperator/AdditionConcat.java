package Day4_ArithmeticOperator;

public class AdditionConcat {

	public static void main(String[] args) {
		
		//Number + Number = Addition
		System.out.println(2+2);
		System.out.println(20+200);
		
		//Number+String : Concatenation
		System.out.println(5 + " hello");
		
		//String+Boolean : Concatenation
		System.out.println("hello "+ true);
		
		//String + String : Concatenation
		System.out.println("hello" + "world");
		
		//Boolean + Number : Concatenation
		//System.out.println(true+1);// Error
		
		System.out.println("good"+1+3);//good13
		System.out.println(1+2+5+"good"+5+2+1);//8good521
		System.out.println(1+2+5+"good"+(5+2+1));//8good8
		  }

		

	}



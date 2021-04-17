package Day8_controlflowstatement;

public class Task36 {

	public static void main(String[] args) {
		
		String moning="8 AM";
		switch (moning) {
		
		case "7 AM":
		    System.out.println("get up");
		    break;
		case "8 AM":
			System.out.println("go to sport");
			break;
		case "9 AM":
			System.out.println("go to work");
		    break;
		default:
			System.out.println("in the working or sleeping");
		
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$");
		 
		
		int n1=10;
		int n2=5;
		String operator="*";
		int result = 0;
		
		switch(operator) {
		
		case "+":	
			result = n1+n2;
			break;
		case "-":
			result = n1-n2;
			break;
		case "*":
			result = n1*n2;
			break;
		case "/":
			result = n1/n2;
		    break;
		default:
			System.out.println("Invalide operator");
		}
			
	    System.out.println("result is "+ result);
	}

}

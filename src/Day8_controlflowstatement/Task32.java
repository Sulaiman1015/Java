package Day8_controlflowstatement;

public class Task32 {

	public static void main(String[] args) {
		
		int num1=1; 
		int num2=10;
		int num3=100;
		
		if((num1>num2) && (num1>num3)) {
			System.out.println("num1 is largest one");	
		}else if((num2>num1) && (num2>num3)) {
			System.out.println("num2 is largest one");
		}else if((num3>num1) && (num3>num2)) {
			System.out.println("num3 is largest one");
		}else {
			System.out.println("all equal");
		}
		

	}

}

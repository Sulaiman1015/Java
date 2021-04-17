package Day7_ControlFlowStatement;

public class task25 {

	public static void main(String[] args) {
		
		int num1=4; 
		int num2=8; 
		int num3=20;
		
		if(num2>num1 & num2>num3) {
			System.out.println("n1 is greater one");
		}
		if(num1>num2 & num1>num3) {
			System.out.println("n2 is greater one");
		}
		if(num3>num1 & num3>num2) {
			System.out.println("n3 is greater one");
		}
		
		System.out.println("***************");
		
		
		int a, b;
		a=10;
		b=11;
		
		if(a!=b) {
			System.out.println("it is not equal");
		}
		System.out.println("***************");
		
		int hour=10;
		if(hour<12) {
			System.out.println("Good Moning");
		}
		
		if(hour>14) {
			System.out.println("Good Aftenoon");
		}
		if(hour>16) {
			System.out.println("Good Evening");
		}

	}

}

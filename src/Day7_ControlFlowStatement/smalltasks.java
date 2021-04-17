package Day7_ControlFlowStatement;

public class smalltasks {

	public static void main(String[] args) {
		
		int x,y=20;
		if(y==20) {
			x=5;
			System.out.println("x = "+x);
		}
		System.out.println("******************");
		
		
		double payrate=1000;
		int hours=42;
		if(hours>40) {
			payrate*=1.5;
		System.out.println("payrate = "+payrate);
		}else {
			System.out.println("payrate = "+payrate);
		}
		System.out.println("$$$$$$$$$$$$$$$$$$");
		
		
		
		int fee=20;
		boolean max=true;
		if(max==true) {
			fee=50;
		System.out.println("fee is "+fee);
		}
		
		System.out.println("********************");
		
		
		int a=100, b=20, c=30;
		if(b==50 & c>=100) {
			a=20;
			System.out.println(a);
		}
		System.out.println("*********************");
		
		int Temp=68;
		if(Temp>70 & Temp<80) {
			System.out.println("IdealTemp");
		}else {
			System.out.println("BedTemp");
		}

	}

}

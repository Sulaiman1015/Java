package Day10_ControlFlowStatement;

public class Task42 {

	public static void main(String[] args) {
		
		int sumO=0;
		int sumE=0;
		int sum=sumO+sumE;
		
		for(int i=1;i<100;i++) {
	    	if(i%2==0) {
	    		sumO=sumO+i;
	    		
	    	}else {
	    		sumE=sumE+i;
	    		
	    	}
	    	sum=sumO+sumE;
		}
		System.out.println("sumOdd = "+sumO);
		System.out.println("sumEven = "+sumE);
		System.out.println("sum = "+ sum);

	}	
}

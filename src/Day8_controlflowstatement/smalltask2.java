package Day8_controlflowstatement;

public class smalltask2 {

	public static void main(String[] args) {
		
		int x=200;
		int y=10;
		
		if(x>100) {
			y=10;
		
		}else {
			y=20;
			
		}
		System.out.println(y);
		
		System.out.println("*************");
		
		
		if(y==100) {
			x=1;
		}else {
			x=0;
		}
	
	    System.out.println(x);
	    
	    
	    System.out.println("*************");
	    
	    int a=0;
	    int b=0;
	    int c=0;
	    
	    
	    if(a<10) {
	    	b=0;
	    	c=1;
	    }else {
	    	b=-99;
	    	c=0;
	    }
	    System.out.println(b);
	    System.out.println(c);
	    
	    
	    System.out.println("*************");
	    
	    
	    int num1=1;
	    int num2=2;
	    if(num1>num2) {
	    	System.out.println("num1>"+"num2");
	    }else {
	    	System.out.println("num1<"+"num2");
	    	
	    }
	    
	    System.out.println("Task30 *************");
	    
	    double n=5;
	    
	    if(n%2==0) {
	    	System.out.println("n is even number");
	    }else {
	    	System.out.println("n is odd number");
	    }
	    	
	    System.out.println("Task31 *************");
	    
	    int n1=60,n2=50,n3=70;
	    if(n1+n2+n3==180) {
	    	System.out.println("valid triangle");
	    }else {
	    	System.out.println("not valid triangle");
	    }
	    	
	  

	}

}

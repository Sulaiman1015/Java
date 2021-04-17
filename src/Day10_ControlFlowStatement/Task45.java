package Day10_ControlFlowStatement;

public class Task45 {

	public static void main(String[] args) {
		
	    int v1=3;
	    int v2=5;
	    
	    
		for(int i=1; i<=3; i++) {
			if(v1>v2) {
				System.out.println("v1 is largest");
			}else if(v1==v2){
				System.out.println("v1 is equal");
			}else {
				System.out.println("v2 is largest");
			}
			
		}

	}

}

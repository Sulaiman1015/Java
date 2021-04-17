package Day8_controlflowstatement;

public class Task35 {

	public static void main(String[] args) {
		
		int a=1000;
		int b=1100;
		int c=1200;
		
		if(a>b) {
			if(a>c) {
				System.out.println("a is greatest");
			}else {
				System.out.println("no a");
			}
			
		}else if(b>a) {
			if(b>c) {
				System.out.println("b is greatest");
			}else if(c>a){
				if(c>b) {
					System.out.println("c is greatest");
				}else {
					System.out.println("no c");
				}
			}
		}else{
			System.out.println("nathing");
		}
		
	}
}

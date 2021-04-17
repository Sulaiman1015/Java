package Day11_ControlFlowStatement;

public class Task52 {

	public static void main(String[] args) {
		
		int i=25;
		while(i>10) {
			System.out.println("in the loop");
			i--;
		}
		int a=0; 
		int sumEven=0;
		while(a<=100) {
			if(a%2==0) {
				sumEven=sumEven+a;
			}
			a++;
		}
		System.out.println(sumEven);

	}

}

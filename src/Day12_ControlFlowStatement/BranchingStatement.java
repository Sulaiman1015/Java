package Day12_ControlFlowStatement;

public class BranchingStatement {

	public static void main(String[] args) {
		
		int n=0;
		while(n<15) {
			n++;
			if(n<=5) {
				System.out.println("skipping number "+n);
				continue;
			}
			System.out.println("number = "+n);
			if(n>=10) {
				System.out.println("breaking at "+n);
				break;
			}
		}

	}

}

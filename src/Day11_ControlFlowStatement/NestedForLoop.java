package Day11_ControlFlowStatement;

public class NestedForLoop {

	public static void main(String[] args) {
		
		for (int i=0;i<3;i++) {
			System.out.println("Outer loop at state: "+i);
			for(int p=0;p<=3;p++) {
				System.out.println("Inner loop at state: "+i);
				if(p==3) {
					System.out.println();
				}
			}
		}

	}

}

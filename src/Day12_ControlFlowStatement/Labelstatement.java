package Day12_ControlFlowStatement;

public class Labelstatement {

public static void main(String[] args) {
		
		int i=0;
		outer:
			do {
				i=8;
				inner:
					while(true) {
						System.out.println(i--);
						if(i==3) {
							break outer;
						}
					}
			}while(true);
	}
	

}

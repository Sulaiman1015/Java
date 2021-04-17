package Day9_ControlFlowStatement;

public class OrLogicWithSwitch {

	public static void main(String[] args) {
		
		char grade='E';
		//A or B or C -> pass D or E -> fail
		
		switch (grade) {
		case 'A':
		case 'B':
		case 'C':
			System.out.println("Pass");
			break;
		case 'D':
		case 'E':
			System.out.println("fail");
		}

	}

}

package Day9_ControlFlowStatement;

public class Task39 {

	public static void main(String[] args) {
		
		char color='G';
		
		switch (color) {
		case 'r':
		case 'R':
			System.out.println("Red");
			break;
		case 'o':
		case 'O':
			System.out.println("Orange");
			break;
		case 'g':
		case 'G':
			System.out.println("Green");
			break;
		default:
			System.out.println("invalid");
			
		}

	}

}

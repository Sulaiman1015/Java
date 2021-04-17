package Day9_ControlFlowStatement;

public class Task37 {

	public static void main(String[] args) {
     
		
		String computer="acer";
		
		switch (computer) {
		
		case "apple":
			System.out.println("Apple-no virus");
		    break;
		case "dell":
			System.out.println("Tough one");
			break;
	    case "acer":
	    	System.out.println("Not recommanded");
	    	break;
	    default:
	    	System.out.println("do not buy that one");
		}

	}

}

package Day8_controlflowstatement;

public class Switch_Case_Statement {

	public static void main(String[] args) {
		
		String weather="sunny";
		switch(weather) {
		
		case "sunny":
			System.out.println("go to park");
			System.out.println("Code Java");
			break;
		case "hot":
			System.out.println("go to swimming");
			System.out.println("Code Java");
			break;
		case"windy":
		    System.out.println("Fly a kit");
		    System.out.println("Code Javad");
		    break;
		case"snow":
		    System.out.println("go snowboarding");
		    System.out.println("Code Java");
			break;
		default:
			System.out.println("Code Jave in any other weather");
			
		}
		

	}

}

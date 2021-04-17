package Day45_exceptionhandling;

public class OrCatchBlock {
	
	static String str;

	public static void main(String[] args) {
		
		
		try {
			
			System.out.println(str.toUpperCase());
			
		}catch(IllegalArgumentException | NullPointerException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}

	}

}

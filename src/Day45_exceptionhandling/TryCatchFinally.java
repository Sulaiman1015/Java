package Day45_exceptionhandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		
		String str = "Selenium";
		try{
			
			System.out.println(str.length());
			System.out.println(str.charAt(10));
			
		}catch(Exception e) {
			
			System.out.println("Enter correct index");
			return;
		}finally {
			
			System.out.println("Finally Block");
			
		}
		System.out.println("Bye");

	}

}

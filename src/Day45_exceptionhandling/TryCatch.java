package Day45_exceptionhandling;

public class TryCatch {

	public static void main(String[] args) {
		
		try {
			String str = "Java";
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(4));
			System.out.println(str.charAt(2));
			System.out.println(str.charAt(3));
			
			
		}catch(Exception e){
			
			System.out.println("Exception happened - let you know!");
			
		}
		System.out.println("After try catch block!");

	}

}

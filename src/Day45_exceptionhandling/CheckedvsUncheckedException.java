package Day45_exceptionhandling;

public class CheckedvsUncheckedException {

	public static void main(String[] args) {
		
		
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		

	}

}

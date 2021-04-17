package Day45_exceptionhandling;

public class TryCatch2 {

	public static void main(String[] args) {
		
		int [] nums = {36,6,34,12};
		
		try {
			
			System.out.println(nums[6]);
			
		}catch(Exception e) {
			System.out.println("wrong index");
			//System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		

	}

}

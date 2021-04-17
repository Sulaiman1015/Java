package Day14_Method;

public class Task67 {

	public static void main(String[] args) {
		
		if(lastDigit(5,17)) {
			System.out.println("same");
		}else {
			System.out.println("no same");
		}

	}
	public static boolean lastDigit(int x,int y) {
		
		if(x%10==y%10) {
			return true;
		}else {
			return false;
		}
		
	}

}

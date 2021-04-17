package Day13_Method;

public class CreditcartMethod {

	public static void main(String[] args) {
		double salary=50000;
		int creditRating=5;
		if(salary >=2000 && creditRating>=7) {
			qualify();
		}else {
			noQualify();
		}

	}
	private static void qualify() {
		System.out.println("congrat");
		
	}
	private static void noQualify() {
		System.out.println("sorry");
		
	}
	

}

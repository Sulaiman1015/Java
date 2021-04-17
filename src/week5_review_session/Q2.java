package week5_review_session;

public class Q2 {

	public static void main(String[] args) {
		change(45);
		change(65);
		

	}
	
	public static void change(int priceInCentes) {
		
		int change = 100 - priceInCentes;
		
		int quarter = change/25;
		
		int dimes = (quarter%25) / 10;
		
		int nikles = ((change%25)%10)/5;
		
		System.out.println("your change is "+quarter+" quarters, "+dimes+" dimes,"+nikles+" nikles.");
		
		
	}
	
	

}

package week5_review_session;

public class Q1 {

	public static void main(String[] args) {
        swapNumbers(40, 50);
        
    
    }
    
    public static void swapNumbers(int num1, int num2) {
        
        num2= num1 + num2;
        num1= num2 -num1;
        num2= num2 - num1;
    
        
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        
        
        
    }


}

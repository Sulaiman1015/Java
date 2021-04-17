package Day40_accessmodifiers_final;

public class TestParentChild {

	public static void main(String[] args) {
		
		Child s = new Child();
		System.out.println("Value of x before increament " + s.x);
		
		s.increament();
		System.out.println("Value of x before increament " + s.x);
		
		Parent p = new Parent(); 
		System.out.println("Value of x before increament " + p.x);	
		
		p.increament();
		System.out.println("Value of x before increament " + p.x);
		

	}

}

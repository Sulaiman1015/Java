package Day7_ControlFlowStatement;

public class TASK28 {

	public static void main(String[] args) {
		
		double price,quantity,revenue,discount;
		price=1000;
		quantity=20;
		discount=0;
		
		revenue=price*quantity;
		
		if (revenue>5000) {
			discount=revenue*0.10;
			revenue=revenue-discount;
			System.out.println("discount = " + discount);
			System.out.println("revenue = " + revenue);
		}else{
			System.out.println("discount = " + discount);
			System.out.println("revenue = " + revenue);
			
		}
	
				

	}

}

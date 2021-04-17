package Day4_ArithmeticOperator;

public class Discount {

	public static void main(String[] args) {
		
		
		//this program calculates the sale price of an
		//item that is regularly priced at $59, with a 20% discount on it
		
		double regularPrice=59;
		double discount=regularPrice*0.2;
		double salesPrice=regularPrice-discount;
		
		
		
		System.out.println("Regular Price: $ "+regularPrice);
		System.out.println("Discount Amount: $ "+discount);
		System.out.println("Sale Price: $ "+ salesPrice);
	

	}

}

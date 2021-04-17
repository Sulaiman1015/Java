package Day3_variable_dataTypes;

public class Primitive_variable {

	public static void main(String[] args) {
		
		byte b1= 25;
		byte b2= -25;
		
		
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		
		short s1 =  -32768;
		short s2 = 32767;
		short s3 = 500;
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		
		int i1 = -214768;
		int i2 = 20;
		int i3 =100_000;
		int i4 = 100000;
		
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		
		long l1 = 5000;
		long l2 = -2147483649L;
		
		long CreditCardNumber = 2134_2233_3638_3330l;
		
		System.out.println("l1 = " + l1);
		System.out.println("l2 = " + l2);
		System.out.println("CreditCardNumber = " + CreditCardNumber);
		
		
		//floating number : default is double
		float f1 = 2.1F;
		System.out.println("f1 = "+f1);
		
		double d1 = 3.14;
		System.out.println("d1 = "+d1);
		
		char c1 = 'A';
		char c2 = 65;
		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+c2);
		
		char c3 = '\u0041';
		System.out.println("c3 = "+c3);
		
		char c4 = 8658;
		System.out.println("c4 = "+c4);	
		
		boolean status1 = true;
		boolean status2 = false;
		System.out.println("eligible to take the  : " + status1);
		System.out.println("He is 16, can he take driver licence? : " + status2);
		
	}

}

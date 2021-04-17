package Day6_Logic_operator;

public class Logic_operator {

	private static final char[] A = null;

	public static void main(String[] args) {
		
		
		char c1='A';
		char c2=65;
		int i1=5;
		int i2=10;
		
	
		
		boolean res1=(i1==i2)&&(c1==c2);
		System.out.println(res1);
		
		boolean res2=(i1==i2)&(c1==c2);
		System.out.println(res2);
		
		boolean res3=(i1==i2)||(c1==c2);
		System.out.println(res3);
		
		boolean res4=(i1==i2)|(c1==c2);
		System.out.println(res4);
		
		boolean res5=(i1==i2)^(c1!=c2);//f+f=f
		System.out.println(res5);
		
		boolean res6=(i1!=i2)^(c1==c2);//t+t=f
		System.out.println(res6);

		
	}

}

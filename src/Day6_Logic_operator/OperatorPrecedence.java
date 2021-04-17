package Day6_Logic_operator;

public class OperatorPrecedence {

	public static void main(String[] args) {
		
		int AC=20;
		int OC=30;
		int PC=30;
		
		boolean cp=(AC<OC)||(OC>=PC);//t+t=t
		System.out.println(cp);
		
		String OW="Shinny";
		int Degree=70;
		boolean comp2=(!(OW=="Ranning"||Degree==70));
		//!(f||t)=!t=f
		System.out.println(comp2);
		
		int b = 2;
		boolean res= ++b ==2 || --b ==2 && --b ==2;
		// 3==2 || 2==2 && 1==2 ->f || f -> f
		System.out.println(res);
		
		boolean x=true,z=true;
		int y=20;
		x=(y!=10)||(z=false);//t||f -> t
		System.out.println(x);
		
		double d1=20;
		double d2=80;
		double res1=(d1+d2)*25;
		double remainder =res1%40;
		System.out.println(remainder<=20);
		
		
		

	}

}

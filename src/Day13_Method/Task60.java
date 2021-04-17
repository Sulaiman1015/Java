package Day13_Method;

public class Task60 {

	public static void main(String[] args) {
		calulator(6,6,"+");
		calulator(6,6,"-");
		calulator(6,6,"*");
		calulator(6,6,"/");
		

	}
	public static void calulator(int a,int b,String operator) {
		switch(operator){
			case "+":
				System.out.println(a+b);
				break;
			case "-":
				System.out.println(a-b);
				break;
			case "*":
				System.out.println(a*b);
				break;
			case "/":
				System.out.println(a/b);
				break;
				
		}
	}

}

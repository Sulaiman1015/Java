package Day36_StaticClassMember;

public class CalculatorTest {

	public static void main(String[] args) {
		/*
		Calculator c1=new Calculator();
		System.out.println(c1.plus(2,4));
		System.out.println(c1.minus(2,4));
		System.out.println(c1.multi(2,4));
		*/
		System.out.println(Calculator.plus(2, 4));
		System.out.println(Calculator.minus(2, 4));
		System.out.println(Calculator.multi(2, 4));

	}

}

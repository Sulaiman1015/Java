package Day36_StaticClassMember;

public class DinnerTest {

	public static void main(String[] args) {
		Dinner mom=new Dinner();
		Dinner kid=new Dinner();
		Dinner dad=new Dinner();
		
		System.out.println("Total Slice:"+Dinner.pizzaSlice);
		
		mom.takeASlice();
		dad.takeASlice();
		kid.takeASlice();
		
		System.out.println("Total Slice:"+Dinner.pizzaSlice);
		
		dad.takeASlice(3);
		kid.takeASlice(2);
		
		System.out.println("Total Slice:"+Dinner.pizzaSlice);

	}

}

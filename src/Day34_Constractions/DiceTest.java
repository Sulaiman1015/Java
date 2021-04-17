package Day34_Constractions;

public class DiceTest {

	public static void main(String[] args) {
		final int six_sides=6;
		Dice sixDice=new Dice(six_sides);
		rollDice(sixDice);
	}
	public static void rollDice(Dice d){
		System.out.println("rolling a "+d.getSides()+" sided dice");
		
		System.out.println("The dice's value: "+d.getValue());
		
	}

}

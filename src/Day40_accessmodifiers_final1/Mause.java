package Day40_accessmodifiers_final;

public class Mause extends Rodent{
	
	protected int tailLength = 8;
	
	public void getMauseDetails() {
		System.out.println("tail:"+ tailLength +",parentTail:"+ super.tailLength);
	}
	

}

package Day36_StaticClassMember;

public class Countable {
	
	static int intstanceCount;
	
	public Countable() {
		intstanceCount++;
	}
	public int getInstanceCount() {
		
		
		return intstanceCount;
	}

}

package Day38_Inheritances_part2;

public class Dog extends Animal {
	//if u don't have any custom constructor,jvm will insert default constructor;
    //if parent has parameter constructor, u have to create constructor and call parent constructor with super keyword
	
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	
	
	public Dog(int eyes,int legs,int tail,int teeth,String coat) {
		super("Yorki",1,1,8,20);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}



	public void chew() {
		
	}
	
}

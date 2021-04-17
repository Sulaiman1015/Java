package Day34_Constractions;

public class Light {
	
	int noOfwattes;
	boolean indicator;
	String location;
	
	public Light() {
		this(0,false);
		System.out.println("returning from no argument coonstructor n1");
		
	}
	public Light(int watt, boolean ind) {
		this(watt,ind,"x");
		System.out.println("returning from no argument coonstructor n2");
		
	}
	public Light(int noOfwattes, boolean indicator, String location) {
		
		this.noOfwattes = noOfwattes;
		this.indicator = indicator;
		this.location = location;
		System.out.println("returning from no argument coonstructor n3");
	}
	

}

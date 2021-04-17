package Day42_Interface;

public interface Electric {
	
	public static final boolean HAS_BATTERIES = true;
	
	boolean HAS_BATTERIES2 = false;
	
	public default void methodA() {
		
	}
	public static void methodB() {
		
	}
	
	public abstract void charge();
	void charge2();//public abstract 

}

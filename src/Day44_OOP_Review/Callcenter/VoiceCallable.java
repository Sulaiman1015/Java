package Day44_OOP_Review.Callcenter;

public interface VoiceCallable {
	
	boolean CAN_CALL = true;//same of : public static final boolean CAN_CALL = true;
    
	void call(String contact);
    
    public static void decline() {
    	System.out.println("Mike declined voice call...");
	}
    public default void accept() {
    	System.out.println("Mike finally accepted voice call...");
    	
    }

}

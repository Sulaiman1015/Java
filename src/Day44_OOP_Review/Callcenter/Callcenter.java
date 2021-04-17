package Day44_OOP_Review.Callcenter;

public class Callcenter {

	public static void main(String[] args) {
		
		WhatsApp wa = new WhatsApp();
		
		wa.allOSCompatible=true;
		wa.isFree=true;
		wa.accept();
		wa.call("Ozzy");
		wa.sendMessage("Thank you");
		wa.launch();
		wa.videoCall();
		wa.name="Whats App";
		
		System.out.println("====================");
		VoiceCallable.decline();
		System.out.println(VoiceCallable.CAN_CALL);
		
		wa.getCount();
		wa.setCount(4);
		System.out.println("====================");
		
		VoiceCallable obj = new WhatsApp();
		
		((MessagingApp)obj).launch();
		
		((MessagingApp)obj).allOSCompatible = false;
		
		 obj.call("Mr Tom");
		 
		 ((WhatsApp)obj).videoCall();
		 
		 //((VideoCallable)obj).videoCall();
		
		

	}

}
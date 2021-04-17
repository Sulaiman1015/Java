package Day16_classeObjects;

public class Contact {
	String name;
	int phoneNumber;
	String email;
	
	public void call() {
		System.out.println("calling"+name+"...");
	}
	public void sendMessage() {
		System.out.println("sending message to"+phoneNumber+" | name: "+name);
	}
	public void sendEmail() {
		System.out.println("sending email to "+email+"...");
	}

}

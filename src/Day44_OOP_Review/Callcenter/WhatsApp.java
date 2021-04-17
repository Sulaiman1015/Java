package Day44_OOP_Review.Callcenter;

public class WhatsApp extends MessagingApp implements VoiceCallable, VideoCallable{

	@Override
	public void sendMessage(String msg) {
		
		System.out.println("WhatApp - sending a message - "+ msg+"...");
	}

	@Override
	public void videoCall() {
		System.out.println("WhatApp - doing a video call Mr Mike...");
		
	}

	@Override
	public void call(String contact) {
		
		System.out.println("WhatApp - calling " + contact+"...");
	}

}

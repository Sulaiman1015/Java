package Day45_exceptionhandling;

public class ThrowAndThrows {

	public static void main(String[] args){
		
		System.out.println("hello world");
		
		//throw new RuntimeException("This is some Excepting");
		try {
		throw new Exception("Another exception");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		String username = "";
		if(username.isEmpty()) {
			throw new RuntimeException("Username can not be empty");
		}else {
			System.out.println("valide username");
		}
	}
	
	public static void sleep(int seconds) throws InterruptedException {
		Thread.sleep(seconds*1000);
	}
	public static void sleep2(int seconds) throws InterruptedException {
		sleep(seconds);
		
	}
	public static void sleep3(int seconds) throws InterruptedException {
		sleep2(seconds);
	}

}

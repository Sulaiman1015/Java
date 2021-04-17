package Day40_accessmodifiers_final;

public class MethodHidingTest {

	public static void main(String[] args) { 

	}
class Bear{
		
		public void eat() {
			System.out.println("Bear is eating");
		}
		
		public void sneeze() {
			System.out.println("Bear is sneezing");
		}
		
		public void hibernate() {
			System.out.println("Bear is hibernating");
		}
		
	}

class Panda extends Bear{
		
		public void eat() {
			System.out.println("Panda is eating");
		}
		/*
		public void sneeze() {
			System.out.println("Panda is sneezing");
		}
		*/
		
		public void hibernate() {
			System.out.println("Panda is hibernating");
		}

	}

}

package Day19_StringManimulation;

public class Task77 {

	public static void main(String[] args) {
		String emoji=":/";
		if(emoji.length()!=2) {
			System.out.println("invalid emoji");
			return;
		}
		char first=emoji.charAt(0);
		char second=emoji.charAt(1);
		
		if(first==':') {
			if(second==')') {
				System.out.println("smaile");
			}else if(second=='('){
				System.out.println("sad");
				
			}else if(second=='/') {
				System.out.println("upset");
			}else {
				System.out.println("unknown emoji");
				
			}
			
		
		}else if(first==';'){
			if(second==')') {
				System.out.println("wink");
			}else if(second=='0') {
				System.out.println("suprised");
			}else {
				System.out.println("unknown emoji");
			}
			
		}

	}

}

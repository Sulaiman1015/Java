package Day22_StringLab;

public class String_question1 {

	public static void main(String[] args) {
		System.out.println(helloName("Bob "));
		System.out.println(helloName("Alice"));
		System.out.println(helloName("X"));
	}
	public static String helloName(String str){
		
		return "hello ".concat(str).concat("!");
	}

}

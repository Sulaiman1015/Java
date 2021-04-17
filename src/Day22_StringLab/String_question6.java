package Day22_StringLab;

public class String_question6 {

	public static void main(String[] args) {
		System.out.println(withEnd("Hello"));
		System.out.println(withEnd("Java"));
		System.out.println(withEnd("Coding"));

	}
	public static String withEnd(String str) {
		return str.substring(1, str.length()-1);
	}

}

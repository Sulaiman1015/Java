package Day22_StringLab;

public class String_question5 {

	public static void main(String[] args) {
		System.out.println(firstHalf("woohoo"));
		System.out.println(firstHalf("hellothere"));
		System.out.println(firstHalf("abcdef"));

	}
	public static String firstHalf(String str) {
		int x=str.length()/2;
		return str.substring(0, x);
	}

}

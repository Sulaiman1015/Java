package Day19_StringManimulation;

public class StringCharAt {

	public static void main(String[] args) {
		String  word="Computer";
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.length());
		
		String word1="Apple";
		if(word1.charAt(0)=='A') {
			System.out.println("A is first character");
		}else {
			System.out.println("A is not first character");
		}
		
		String word2="civic";
		
		if(word2.charAt(0)==word2.charAt(4)) {
			System.out.println("first and last character are same");
		}else {
			System.out.println("not same");
		}
		String word3="Java";
		int x=word3.length()-1;
		System.out.println(x);
		char lastChar=word3.charAt(x);
		System.out.println(lastChar);
		
		
		
		

	}

}

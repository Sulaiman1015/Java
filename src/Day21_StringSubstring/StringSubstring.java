package Day21_StringSubstring;

public class StringSubstring {

	public static void main(String[] args) {
		String sentence="Java String Munipulation is fun!";
		System.out.println(sentence.substring(1));
		System.out.println(sentence.substring(5, 11));
        System.out.println(sentence.substring(5, sentence.length()-5));
        
        
        String chars="{{}}";
        String word="AUTOMATION";
        String result=chars.substring(0,2)+word+chars.substring(2);
        System.out.println(result);
       
        System.out.println(word.toLowerCase());
        
        System.out.println(word.toUpperCase());
        
        
        
	}

}

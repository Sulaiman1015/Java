package Day19_StringManimulation;

public class StringConcat {

	public static void main(String[] args) {
		
		String word="Java";
		
		System.out.println(word.concat(" is good"));
		
		//word=word.concat(" can do every thing");
		System.out.println(word);
		
		System.out.println(word.concat("+eclip"));
		
		word=word+123;
		System.out.println(word.concat("google"));
		
		String word1=word.concat("good").concat(" fine");
		System.out.println(word1);

	}

}

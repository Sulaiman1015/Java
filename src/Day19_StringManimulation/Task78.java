package Day19_StringManimulation;

public class Task78 {

	public static void main(String[] args) {
		
		String word="abcabqcabc";
		char myChar='a';
		int counter=0;
		
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)==myChar) {
				counter++;
			}
		}
		System.out.println("Count of "+myChar+" is "+counter);

	}

}

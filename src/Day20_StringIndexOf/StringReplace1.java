package Day20_StringIndexOf;

public class StringReplace1 {

	public static void main(String[] args) {
		String sentence="Coding is fun, it is my hobby!!";
		String withNoSpace=sentence.replace(" ", "");
		System.out.println(sentence);
		System.out.println(withNoSpace);
		
		String x=sentence.replace(",", "!!!");
		System.out.println(x);
		
		String mixed="@&j§a*va$€";
		mixed=mixed.replace("@&", "").replace("§", "").replace("*", "").replace("$€", "");
		System.out.println(mixed);
		
		String result="About 8,930,000,000 results (0.68 seconds)";
		result=result.replace("About ", "").replace(" results (0.68 seconds)", "");
		System.out.println(result);

	}

}

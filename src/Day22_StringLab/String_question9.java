package Day22_StringLab;

public class String_question9 {

	public static void main(String[] args) {
		System.out.println(rotatedRight2("hello"));
		System.out.println(rotatedRight2("java"));
		System.out.println(rotatedRight2("hi"));
				

	}
	public static String rotatedRight2(String str) {
		//String str1=str.substring(0, 2);
		//String str2=str.substring(2);
		return str.substring(str.length()-2).concat(str.substring(0, str.length()-2));
	}

	}



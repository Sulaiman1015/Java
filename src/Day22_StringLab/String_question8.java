package Day22_StringLab;

public class String_question8 {

	public static void main(String[] args) {
		System.out.println(rotatedLeft2("hello"));
		System.out.println(rotatedLeft2("java"));
		System.out.println(rotatedLeft2("hi"));
				

	}
	public static String rotatedLeft2(String str) {
		//String str1=str.substring(0, 2);
		//String str2=str.substring(2);
		return str.substring(2).concat(str.substring(0, 2));
	}

}

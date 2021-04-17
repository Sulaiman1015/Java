package Day22_StringLab;

public class String_question4method {

	public static void main(String[] args) {
		System.out.println(firstTwo("hello"));
		System.out.println(firstTwo("abcdefg"));
		System.out.println(firstTwo("hi"));
		System.out.println(firstTwo(""));
		System.out.println(firstTwo("a"));
		
	}
	public static String firstTwo(String str) {
		
		if(str.length()<2) {
		return str;
	}else if(str.isEmpty()) {
		return "";
	}else {
		str=str.substring(0,2);
		return str;
	}
	}
}

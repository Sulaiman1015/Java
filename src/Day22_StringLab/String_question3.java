package Day22_StringLab;

public class String_question3 {

	public static void main(String[] args) {
		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("ab"));
		
		System.out.println(extraEnd("Hi"));
		System.out.println(extraEnd("x"));

	}
	public static String extraEnd(String str){
		
		if(str.length()<2) {
			return "Invalid String";
		}else {
			
			str=str.substring(str.length()-2);
			return str+str+str;
		}
		//return str;
		
	}

}

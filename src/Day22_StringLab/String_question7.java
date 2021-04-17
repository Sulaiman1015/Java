package Day22_StringLab;

public class String_question7 {

	public static void main(String[] args) {
		System.out.println(comboString("hello","hi"));
		System.out.println(comboString("hi","hello"));
		System.out.println(comboString("aaa","b"));

	}
	public static String comboString(String a,String b) {
		if(a.length()<b.length()) {
			return a+b+a;//a.concat(b).concat(a);
		}else if(a.length()>b.length()){
			return b+a+b;
		}else {
			return a+b;
			
		}
		
	}

}

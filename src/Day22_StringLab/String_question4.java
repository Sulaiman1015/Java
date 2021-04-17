package Day22_StringLab;

public class String_question4 {

	public static void main(String[] args) {
		String str="hello";
		String str1="abcdefg";
		String str3="ab";
		
		if(str.length()<2) {
			System.out.println("X");
		}else {
			str=str.substring(0, 2);
			System.out.println(str);
			
			str1=str1.substring(0, 2);
			System.out.println(str1);
			
			str3=str3.substring(0, 2);
			System.out.println(str3);
		}
		

	}

}

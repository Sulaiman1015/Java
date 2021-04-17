package Day20_StringIndexOf;


public class Task80 {

	public static void main(String[] args) {
		String str1="your order confirmation number is xyz";
		String str2="confirmation";
		if(str1.contains(str2)) {
			System.out.println("str2 is existing in str1");
			System.out.println("position is "+str1.indexOf(str2));
		}else {
			System.out.println("not found");
		}

	}

}

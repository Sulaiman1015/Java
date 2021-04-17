package Day20_StringIndexOf;

public class StringReplace {

	public static void main(String[] args) {
		String str="Moscow is a capital of Russia";
		str=str.replace("Moscow", "Baku").replace("Russia","Azerbaijan");
		System.out.println(str);
		
		String email="firstName_lastName@gmail.com";
		email=email.replace("gmail", "company");
		System.out.println(email);

	}

}

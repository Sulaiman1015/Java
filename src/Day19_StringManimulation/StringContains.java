package Day19_StringManimulation;

public class StringContains {

	public static void main(String[] args) {
		
		String str="hello Mike, welcom to Cybertek";
		boolean bool=str.contains("Cybertek");
		System.out.println(bool);
		
		String email="test@gmail.com";
		System.out.println(email.contains("@"));
		
		String list = "potatoes,tomatoes,eggs,milk,break,cereal,meat,apples";
		if(list.contains("apples")) {
			System.out.println("apples is in your list");
		}
		boolean hasCucumbers=list.contains("Cucumbers");
		System.out.println("Contains Cucumber:"+hasCucumbers);
		
		boolean hasEggs=list.contains("egg");
		System.out.println("Contains Eggs:"+hasEggs);
		
		email="name@yahoo.com";
		if(email.contains("@yahoo.com")) {
			System.out.println("yahoo account");
		}else if(email.contains("@gmail.com")) {
			System.out.println("gmail account");
		}
		
		String searchItem="computer";
		String title="Amazon.com: computer";
		if(title.contains(searchItem)) {
			System.out.println("pass");
		}

	}

}

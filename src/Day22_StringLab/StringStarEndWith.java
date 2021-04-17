package Day22_StringLab;

public class StringStarEndWith {

	public static void main(String[] args) {
		String word="eclipse";
		System.out.println(word.startsWith("e"));
		System.out.println(word.startsWith("ec"));
		System.out.println(word.endsWith("se"));
		System.out.println(word.endsWith("ipse"));
		
		String name="Dr.Jackson";
		if(name.startsWith("Mr.")) {
			System.out.println("married man");
		}else if(name.startsWith("Mrs.")) {
			System.out.println("married woman");
		}else if(name.startsWith("Ms.")) {
			System.out.println("some man");
		}else if(name.startsWith("Dr.")) {
			System.out.println("Dortor man or woman");
		}else{
			System.out.println("Unknow status");
		}
		

	}

}

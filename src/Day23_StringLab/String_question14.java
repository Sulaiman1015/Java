package Day23_StringLab;

public class String_question14 {

	public static void main(String[] args) {
		String str="oddy";
		
		if(str.length()<2) {
			System.out.println(false);
			return;
		}
			
		if(str.substring(str.length()-2).equals("ly")){
		//if(str.endsWith("ly")) {
			
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	}

}

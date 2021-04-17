package Day23_StringLab;

public class String_question11 {

	public static void main(String[] args) {
		String str="abc hi ho";
		int counter=0;
		for(int i=0;i<str.length()-1;i++)
			if(str.substring(i, i+2).equals("hi")) {
				
				counter++;
				System.out.println(counter);
				
			}
		System.out.println(counter);

	}
	
	

}

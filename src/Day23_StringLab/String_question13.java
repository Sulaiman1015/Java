package Day23_StringLab;

public class String_question13 {

	public static void main(String[] args) {
		String str="the";
		for(int i=0; i<str.length();i++) {
			String x=str.substring(i,i+1).concat(str.substring(i,i+1));
			
			
			
			System.out.print(x);
			
		}

	}
	
		
	

}

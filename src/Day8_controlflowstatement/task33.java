package Day8_controlflowstatement;

public class task33 {

	public static void main(String[] args) {
		
		int marks=90;
		
		if(marks<60) {
			System.out.println("fail");
		}else if((marks>=60) && (marks<90)) {
			System.out.println("pass");
		}else if(marks>=90) {
			System.out.println("pass with distinction");
		}else{
			System.out.println();
		}

	}

}

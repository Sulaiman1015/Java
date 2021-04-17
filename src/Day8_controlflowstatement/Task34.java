package Day8_controlflowstatement;

public class Task34 {

	public static void main(String[] args) {
		
		int math=74;
		int chemical=66;
		int biology=65;
		
		double mark=(math+chemical+biology)/3;
		
		if((mark<=100) && (mark>=90)) {
			System.out.println("Grade is A");
		}else if((mark<=89) && (mark>=80)) {
			System.out.println("Grade is B");
		}else if((mark<=79) && (mark>=70)) {
			System.out.println("Grade is C");
		}else if((mark<=69) && (mark>=60)) {
			System.out.println("Grade is D");
		}else if((mark<=59) && (mark>=0)) {
			System.out.println("Grade is F");
		}else {
			System.out.println("invalid");
		}

	}

}

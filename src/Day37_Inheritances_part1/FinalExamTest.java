package Day37_Inheritances;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int questions;
		int missed;
		
		System.out.println("how many questions are on the final exam?");
		questions=sc.nextInt();
		
		System.out.println("how many questions did student miss?");
		missed=sc.nextInt();
		
		FinalExam exam=new FinalExam(questions, missed);
		
		System.out.println(exam.getGrade());

	

	
	}

}

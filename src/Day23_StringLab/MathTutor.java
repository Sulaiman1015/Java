package Day23_StringLab;

import java.util.Random;
import java.util.Scanner;

public class MathTutor {

	public static void main(String[] args) {
		//for(int i=1;i<5;i++) {
		int n1;
		int n2;
		int sum;
		int userAnswer;
		int counter=0;
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		
		
		
		System.out.println("Calcul");
		
		for(int i=1;i<4;i++) {
			n1=rn.nextInt(10);
			n2=rn.nextInt(10);
		System.out.print(n1+"+"+n2+"=");
		
		userAnswer=sc.nextInt();
		
		sum=n1+n2;
		
		if(userAnswer==sum) {
			
			counter+=10;
			System.out.println("correct");
			
		}else {
			System.out.println("wrong answer. the answer is "+sum);
		}
		}
		System.out.println("you get totally "+counter+" points");
		

	}

}

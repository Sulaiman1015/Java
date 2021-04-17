package Day23_StringLab;

import java.util.Random;

public class Task84_coinTosse {

	public static void main(String[] args) {
		Random rn=new Random();
		int counter1=0;
		int counter2=0;
		for(int i=1;i<=10;i++) {
			
			if(rn.nextInt(2)==0) {
				counter1++;
				System.out.println("Tails");
			}else {
				counter2++;
				System.out.println("Heads");
			}
			
		}
		System.out.println(counter1+" times Tails");
		System.out.println(counter2+" times Heads");
		
	}

}

package Day23_StringLab;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		
		Random rn=new Random();
		System.out.println(rn.nextLong());
		System.out.println(rn.nextBoolean());
		System.out.println(rn.nextInt(50));//0 _ 49
		System.out.println(rn.nextInt(10));//0 _ 9
		System.out.println(rn.nextInt(10)+5);//5 _ 14

	}

}

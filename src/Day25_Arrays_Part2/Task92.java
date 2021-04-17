package Day25_Arrays_Part2;

import java.util.Arrays;

public class Task92 {

	public static void main(String[] args) {
		
		int[] number=new int[10];
		
		for(int i=0;i<number.length;i++) {
			
			number[i]=i+1;
			
		}
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]*19);
		}
		System.out.println(Arrays.toString(number));

	}

}

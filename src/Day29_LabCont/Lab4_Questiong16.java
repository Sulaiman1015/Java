package Day29_LabCont;

public class Lab4_Questiong16 {

	public static void main(String[] args) {
int[] x = {2,1,2,3,7};
		
		System.out.println(countEvens(x));
		
	}
	
	public static int countEvens(int[] arr) {
		
		int counter = 0;
		
		for(int value : arr) {
			
			if(value%2==0) {
				
				counter++;
				
			}
		}
		
		return counter;

	}

}

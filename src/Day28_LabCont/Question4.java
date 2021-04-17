package Day28_LabCont;

public class Question4 {

	public static void main(String[] args) {
		
		int[] x= {1,2,3};
		int[] y= {5,11,2};
		int[] z= {7,0,0};
		int[] a= {3,-2,10,4};
		
		System.out.println(sumArray(x));
		System.out.println(sumArray(y));
		System.out.println(sumArray(z));
		System.out.println(sumArray(a));
		
		

	}
	public static int sumArray(int[] arr) {
		int sum=0;
		for(int value:arr) {
			
			sum=sum+value;
			
		}
		return sum;
		
	}

}

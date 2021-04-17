package Day27_Arrays_Part4;

public class Task95 {

	public static void main(String[] args) {
		int[][] scores= {
				{68,75,54,80},
				{100,64,20,50},
				{10,35,40,90}
		};
		
		int sum=0;
		
		for(int i=0;i<scores[0].length;i++) {
			sum=sum+scores[0][i];
			
		}
		//System.out.println(sum);
		int avg=sum/scores[0].length;
		System.out.println(avg);
		
		int sum1=0;
		for(int i=0;i<scores.length;i++) {
			sum1=sum1+scores[i][0];
			
		}
		System.out.println(sum1);

	}

}

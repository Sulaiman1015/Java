package Day27_Arrays_Part4;

public class Length {

	public static void main(String[] args) {
		int[][] numbers= {
				{1,2,3,4},
				{5,6},
				{10,20,30,40,60,70,80}
		
		};
		//System.out.println(numbers.length);
		
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println("the number of columns in row "+i+" is "+numbers[i].length);
			for(int x=0;x<numbers[i].length;x++) {
				
				System.out.println(numbers[i][x]+",");
			}
		}

	}

}

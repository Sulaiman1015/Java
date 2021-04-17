package Day25_Arrays_Part2;

public class ForEachLoop {

	public static void main(String[] args) {
		String [] products= {"Timberland","Shirt","Watch","Bag","Shoes"};
		double[] prices= {120,123,121,223,211};
		
		for(String prod:products) {
			System.out.println(prod);
		}
		for(double pr:prices) {
			System.out.println(pr);
			
		}
		System.out.println("-----------------");
		for(int i=prices.length-1;i>=0;i--) {
			System.out.println(prices[i]);
		}

	}

}

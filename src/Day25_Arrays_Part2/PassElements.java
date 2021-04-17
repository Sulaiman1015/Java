package Day25_Arrays_Part2;

public class PassElements {

	public static void main(String[] args) {
		int[] numbers= {5,6,7,8,9};
		for(int value:numbers) {
			showValue(value);
		}

	}
	public static void showValue(int n) {
		System.out.print(n+" ");
	}

}

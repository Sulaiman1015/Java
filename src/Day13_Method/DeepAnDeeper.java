package Day13_Method;

public class DeepAnDeeper {

	public static void main(String[] args) {
		
		System.out.println("i am starting in main");
		deep();
		System.out.println("now i am back in main");

	}
	public static void deep() {
		System.out.println("i am in deep");
		deeper();
		System.out.println("now i am in deep");
	}
	public static void deeper() {
		System.out.println("i am now in deeper");
	}

}

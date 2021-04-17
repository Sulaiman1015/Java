package Day34_Constractions;

public class AppleTest {

	public static void main(String[] args) {
		
		Apple a1=new Apple();
		changeApple(a1);
		System.out.println(a1.color);

	}
	public static void changeApple(Apple a1) {
		
		a1.color="white";
	}

}

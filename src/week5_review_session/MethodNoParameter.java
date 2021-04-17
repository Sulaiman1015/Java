package week5_review_session;

public class MethodNoParameter {

	public static void main(String[] args) {
		
		//countFromto10();
		countFromto10();
		printAtoZ();
	}
public static void countFromto10() {
	
	for (int i=1;i<=10;i++) {
		System.out.print(i+" ");
	}
	System.out.println();
}
public static void printAtoZ() {
	
	for(char letter='A';letter<='Z';letter++) {
		System.out.print(letter+" ");
	}
	System.out.println();
}
}

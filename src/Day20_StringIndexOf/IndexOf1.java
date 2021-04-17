package Day20_StringIndexOf;

public class IndexOf1 {

	public static void main(String[] args) {
		//index of with 2 values
		
		String list="html-selenium-angular-jenkins-grid";
		
		int firstDash=list.indexOf("-");
		System.out.println(firstDash);
		
		int secondDash=list.indexOf("-", firstDash+1);
		System.out.println(secondDash);
		
		int thirdDash=list.indexOf("-",secondDash+1);
		System.out.println(thirdDash);
		
		int lastDash=list.lastIndexOf("-");
		System.out.println(lastDash);
		
		
		
	}	

}

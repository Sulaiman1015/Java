package Day15_Method;

public class Task68 {

	public static void main(String[] args) {
		
	
		yearUntilRetirement("Mike",1960);
		
		
	}
	public static int calculteAge(int yearbirth) {
		int age=2020-yearbirth;
		
		return age;
	}
	public static void yearUntilRetirement(String name,int year) {
		
		int leftyear=72-calculteAge(year);
		
		System.out.println(name+" is "+calculteAge(year)+" yearold.");
		System.out.println(name+" retire in "+leftyear+" years.");
	
	
	}

}

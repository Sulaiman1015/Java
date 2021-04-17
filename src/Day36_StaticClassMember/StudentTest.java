package Day36_StaticClassMember;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("Mike",30,1000);
		Student s2 = new Student("Nike",31,2000);
		Student s3 = new Student("Vike",32,3000);
		
		s1.school="W3School";
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());

	}

}

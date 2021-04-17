package Day36_StaticClassMember;

public class Student {
	String name;
	int age;
	int idNumber;
	static String school="Cybertek";
	public Student(String name, int age, int idNumber) {
		super();
		this.name = name;
		this.age = age;
		this.idNumber = idNumber;
		this.school = school;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", idNumber=" + idNumber + ", school=" + school + "]";
	}
	
	

}

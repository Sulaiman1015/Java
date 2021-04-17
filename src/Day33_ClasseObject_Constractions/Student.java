package Day33_ClasseObject_Constractions;

public class Student {
	String name;
	int age;
	char gender;
	int year;
	String course;
	String university="Cybertek";
	public Student(String name, int age, char gender, int year, String course) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
		
	}
	public void attendLecture() {
		System.out.println(name+" is attending");
	}
	public void submitAssignment() {
		System.out.println(name+" is submiting");
	}
	public void attendLab() {
		System.out.println(name+" is attending");
	}

}

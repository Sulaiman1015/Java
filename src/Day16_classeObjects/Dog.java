package Day16_classeObjects;

public class Dog {
	
	//class is a blueprint and common properties and method
	
	String breed;
	int age;
	String color;
	String name;
	
	public void barking() {
		System.out.println(name+ " is barking");
	}
	public void hungry() {
		System.out.println(name+ " is hungry");
	}
	
	public void sleep() {
		System.out.println(name+ " is sleeping");
	}

}

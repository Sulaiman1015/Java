package Day16_classeObjects;

public class Employee {
	String name;
	String jobTitle;
	double salary;
	
	public void work() {
		System.out.println(name+" is working hard...");
	}
    public void attendMeetin() {
		System.out.println(name+" is attending a meetin...");
	}
    public void introuduce() {
		System.out.println("name:"+name+"jobtitle is: "+jobTitle+"salary: "+salary);
	}


}

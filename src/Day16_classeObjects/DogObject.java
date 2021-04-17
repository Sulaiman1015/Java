package Day16_classeObjects;

public class DogObject {

	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		Dog dog2=new Dog();
		Dog dog3=new Dog();
		//dog1
		dog1.age=10;
		dog1.color="red";
		dog1.breed="Maltese";
		dog1.name="Rover";
		System.out.println(dog1.age);
		System.out.println(dog1.color);
		System.out.println(dog1.breed);
		System.out.println(dog1.name);
		
		dog1.barking();
		dog1.hungry();
		dog1.sleep();
		
		//dog2
		dog2.age=11;
		dog2.color="black";
		dog2.breed="Maltese";
		dog2.name="Tom";
		System.out.println(dog2.age);
		System.out.println(dog2.color);
		System.out.println(dog2.breed);
		System.out.println(dog2.name);
		
		dog2.barking();
		dog2.hungry();
		dog2.sleep();

	}

}

package Day43_Polymorphism;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Animal Dog = new Animal();
		Animal Bird = new Animal();
		animal = new Cat();
		
		
	}

}
class Animal{}
class Dog extends Animal{}
class Bird extends Animal{}
class Cat extends Animal{}

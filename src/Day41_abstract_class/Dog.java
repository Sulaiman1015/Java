package Day41_abstract_class;

public class Dog extends Animal {
	
	public Dog(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}


	@Override
	void eat() {
		System.out.println("Dog food");
	}

	
	@Override
	void breathe() {
		// TODO Auto-generated method stub
		
	}

}

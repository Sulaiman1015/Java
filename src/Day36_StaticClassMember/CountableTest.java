package Day36_StaticClassMember;

public class CountableTest {

	public static void main(String[] args) {
		//int objectCount;
		Countable o1=new Countable();
		Countable o2=new Countable();
		Countable o3=new Countable();
		/*
		objectCount=o1.getInstanceCount();
		objectCount=o2.getInstanceCount();
		objectCount=o3.getInstanceCount();
		*/
		
		System.out.println(o1.getInstanceCount());

	}

}

package Day17_classeObjects;

public class BMWobject {

	public static void main(String[] args) {
		BMW b1=new BMW();
		BMW b2=new BMW();
		
		
		System.out.println(b1.make);
		System.out.println(b2.make);
		
		b1.make="BMW2019";
		System.out.println(b1.make);
		
		b1.model="X3";
		
		b1.showPric();
		
		b2.model="740i";
		b2.showPric();

	}

}

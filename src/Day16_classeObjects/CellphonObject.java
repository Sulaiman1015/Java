package Day16_classeObjects;

public class CellphonObject {

	public static void main(String[] args) {
		Cellphon phon1=new Cellphon();
		
		phon1.brand="iphone";
		phon1.screenSize=5.1;
		phon1.color="black";
		phon1.price=750;
		
		System.out.println("phon1 brand is "+phon1.brand);
		System.out.println("phon1 screensize is "+phon1.screenSize);
		System.out.println("phon1 color is "+phon1.color);
		System.out.println("phon1 price is "+phon1.price+"euro");
		System.out.println("phon1's fonctions are");
		phon1.call();
		phon1.message();
		phon1.takeAphon();
		
		
	}

}

package Day10_ControlFlowStatement;

public class Task44 {

	public static void main(String[] args) {
		
		System.out.println("KPH          MPH");
		System.out.println("----------------");
		for(int kph=60;kph<=130;kph+=10) {
			double m=kph*0.6214;
			double mph = (int)(Math.round(m * 10))/10.0;//for format decimal to ##.##
			System.out.println(kph+"\t\t"+mph);
		}

	}

}

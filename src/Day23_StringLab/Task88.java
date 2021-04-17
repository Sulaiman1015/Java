package Day23_StringLab;

import java.util.Random;
import java.util.Scanner;

public class Task88 {

	public static void main(String[] args) {
		String[] cars=new String[7];
		cars[0]="Honda";
		cars[1]="Toyota";
		cars[2]="Nissan";
		cars[3]="BMW";
		cars[4]="Mercedes";
		cars[5]="Porsche";
		cars[6]="Ferrari";
		int price=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Select your car:"); 
		Random rn=new Random();
		int i=sc.nextInt();
		String selectCar=cars[i];
		
		switch(selectCar) {
		case "Honda": case "Toyota": case "Nissan":
			price=rn.nextInt((40000-20000)+1)+20000;
			break;
		case "BMW": case "Mercedes":
			price=rn.nextInt((80000-50000)+1)+50000;
			break;
		case "Porsche": case "Ferrari":
			price=rn.nextInt((150000-100000)+1)+100000;
			break;
		default:
			System.out.println("Invalid car");
		}
		
		System.out.println("Price for secected car is "+price);
		

	}

}

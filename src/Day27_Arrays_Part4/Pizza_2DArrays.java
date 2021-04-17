package Day27_Arrays_Part4;

import java.util.Arrays;

public class Pizza_2DArrays {

	public static void main(String[] args) {
		String[][] pizzas= {
				{"pinneapple","pinneoni"},
				{"anchovies","mushroom","olives"},
				{"4 cheese"},
				{"chicken","tomaoes","onioons"},
				{"green peppers","zuccini","brocoli","spinach","shrimp"}
		};
		System.out.println("####FOR EACH LOOP###");
		for(String[] pizza:pizzas) {
			System.out.print(pizza.length+"-");
			System.out.println(Arrays.toString(pizza));
		}
		System.out.println("####FOR ITERATOR LOOP####");
		for(int i=0;i<pizzas.length;i++) {
			System.out.print(pizzas[i].length+"-");
			System.out.println(Arrays.toString(pizzas[i]));
		}
        System.out.println("----------------");
		
		
		for(String value : pizzas[3]) {
			
			System.out.print(value+" ");
			
		}
		System.out.println();
		
		
		int[][] students = {
				{4,5,6}, //each row is array int[] inside 2d array int[][]
				{12,5,7},
				{23,56,12,55,3}
				};
		
		for(int[] group : students) {
			
			for(int studentID : group) {
				
				System.out.println(studentID);
				
			}
		}

	}

}

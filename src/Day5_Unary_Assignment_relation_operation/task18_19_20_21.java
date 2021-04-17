package Day5_Unary_Assignment_relation_operation;

public class task18_19_20_21 {

	public static void main(String[] args) {
		//task18
		int x =2;
		int y =x++; //y=2, x is same line so y is 2
		System.out.println(x);
		System.out.println(y);//2
		
		//task19
		int a=50;
		int resa= --a + a++ + a-- + a++;/* Memory is 50, 
		first change to 49(pre), memory is 49, 
		second change to 49(post), memory is 50,
		third change to 50(post), then memory is 49,
		forth change to 49*/
		System.out.println(resa);//49+49+50+49=197
		
		//task20
		int b=1;
		int resb=-b-- + b++ / -b-- * --b;
		// 1 -> 0 -> 1 -> 0 -> -1
		//-1 + 0 / -1 * -1 = -1
		System.out.println(resb);
		
		//task21
		int c = 4;
		int d = c * 4 - c++;
		//y=16-4
		System.out.println(d);
				

	}

}

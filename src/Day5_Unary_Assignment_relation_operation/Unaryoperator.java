package Day5_Unary_Assignment_relation_operation;

public class Unaryoperator {

	public static void main(String[] args) {
		
		int i1=+10;
		int i2=-100;
		int i3=-(i1+i2);//90
		
		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		System.out.println("i3 = "+i3);
		
		boolean flag= true;
		System.out.println(!flag);
		System.out.println(!!flag);
		
		int i = 10, j = 5;
		//i++;next line +1
		//System.out.println(i++);
		System.out.println(--i);
		//System.out.println(++i);//11
		//System.out.println(i++);//11, next line will be 11, Not at this line
		System.out.println(i);//12
		
		System.out.println(--j);//
		System.out.println(j);
		
		
		//i++;//11, same as i=i+1
		//++i;//12, Memory is i=11
		//--j;//4,same as j=j-1
		System.out.println(i);
		System.out.println(j);
		
		int res= i++ + --j;//res=11+
		System.out.println(res);
		

	}

}

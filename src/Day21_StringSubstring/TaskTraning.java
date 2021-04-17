package Day21_StringSubstring;

public class TaskTraning {

	public static void main(String[] args) {
		String str=" 342 ";
		
		String str1=str.replace(" ", "|");
		System.out.println(str1);
		
		String x="|";
		String str2=x+str.trim()+x;
		System.out.println(str2);
		
		System.out.println(x+str.substring(1, 4)+x);
		
		

	}

}

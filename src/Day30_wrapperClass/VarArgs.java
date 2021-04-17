package Day30_wrapperClass;

public class VarArgs {

	public static void main(String[] args) {
		sum(2,4);
		sum(2,3,4,5);
		concat("apple","orange","123","new34");

	}
	public static void sum(int... numbers) {
		int sum=0;
		for(int value:numbers) {
			sum=sum+value;
		}
		System.out.println(sum);
	}
	public static void concat(String...strs) {
		String newStr="";
		for(String str:strs) {
			newStr=newStr+str.charAt(2);
		}
		System.out.println(newStr);
	}
	

}

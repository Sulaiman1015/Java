package Day26_Arrays_Part3;

import java.util.Arrays;

public class Task94 {

	public static void main(String[] args) {
		String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";
		
		String[] arr1=info1.split("password : ");
		String[] arr2=info2.split("password : ");
		
		//System.out.println(Arrays.toString(arr1));
		
		String pass1=arr1[1].split(" . Please")[0];
		String pass2=arr2[1].split(" . Please")[0];	
		System.out.println(pass1);
		System.out.println(pass2);
		String password=pass1.replace("xxx", "")+pass2.replace("xxx", "");
		System.out.println("Password: "+password);
			
		
		
	}

}

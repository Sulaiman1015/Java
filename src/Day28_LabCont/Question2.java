package Day28_LabCont;

public class Question2 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {1,2,3,1};
		int[] z = {1,2,1}; 
		int[] k = {1};
		
		System.out.println(firstLastEqual(x));
		System.out.println(firstLastEqual(y));
		System.out.println(firstLastEqual(z));
		System.out.println(firstLastEqual(k));

	}
	public static String firstLastEqual(int[] arr) {
		
		if(arr.length>1) {
			if(arr[0]==arr[arr.length-1]) {
				return "true";
				
			}else  {
				return "false";
			}
			
		}else  {
			return "not a valid array";
		}
		
	}

}

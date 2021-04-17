package Day20_StringIndexOf;

import java.util.Scanner;

public class Task82 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter userName:");
		String userName=sc.nextLine();
		
		
		System.out.println("Enter passWord");
		String passWord=sc.nextLine();
		
		String userNameInSystem="su";
		String passWordInSystem="74";
		
		if(userName.equals("") && passWord.equals("")) {
			System.out.println("Username and password fields can not be empty");
		}else if(userName.equals("") && !passWord.equals("")){
			System.out.println("Username can not be empty");
		}else if(!userName.equals("") && passWord.equals("")) {
			System.out.println("Password can not be empty");
		}else if(!userName.equals(userNameInSystem) || ! passWord.equals(passWordInSystem)) {
			System.out.println("Username or password not valid,please verify");
		}else if(userName.equals(userNameInSystem) && passWord.equals(passWordInSystem)) {
			System.out.println("User logged in successfully");
		}
	}

}

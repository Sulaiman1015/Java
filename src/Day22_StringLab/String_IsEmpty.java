package Day22_StringLab;

public class String_IsEmpty {

	public static void main(String[] args) {
		String userName="";
		String passWord="";
		if(userName.isEmpty()) {
			System.out.println("Username field can not be empty");
		}else {
			System.out.println("Username is not empty");
		}
		if(userName.isEmpty()||passWord.isEmpty()){
			System.out.println("Username or Password field can not be empty");
		}else {
			System.out.println("Username or Password is not empty");
		}

	}

}

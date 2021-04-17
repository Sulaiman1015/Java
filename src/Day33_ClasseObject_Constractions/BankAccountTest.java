package Day33_ClasseObject_Constractions;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input;
		System.out.println("what is your balance");
		input=sc.next();
		
		BankAccount account=new BankAccount(input);
		System.out.println("how much were your paid this month?");
		input=sc.next();
		
		account.deposit(input);
		System.out.println("your pay has been deposited. your current balance is " + account.getBalance());

	}

}

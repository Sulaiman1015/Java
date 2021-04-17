package Day17_classeObjects;

public class bankAccount {
	String accountHolder;
	double balance;
	int accountNumber;
	
	public void deposit(double amount) {
		System.out.println("depositing $"+amount+" to "+accountNumber);
		balance+=amount;
	}
	public void withdraw(double amount){
		System.out.println("withdraw $"+amount+" to "+accountNumber);
		balance-=amount;
		if(balance<0) {
			balance-=35;
		}
	}
	public void showBalance() {
		System.out.println("-------------");
		System.out.println("accountHolder: "+accountHolder);
		System.out.println("accountNumber: "+accountNumber);
		System.out.println("balance: $ "+balance);
		System.out.println("-------------");
	}
	public void charge(double price,String item) {
		if(balance>=price) {
			System.out.println("buying "+item+" for $ "+price+" from "+accountNumber);
		}else {
			System.out.println("insufficient funds to purhase "+item+" from "+accountNumber);
		}
	}

}

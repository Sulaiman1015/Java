package Day17_classeObjects;

public class bankAccountObject {

	public static void main(String[] args) {
		
		bankAccount holder1=new bankAccount();
		holder1.accountHolder="Mike Smith";
		holder1.accountNumber=12345;
		holder1.deposit(250);
		holder1.showBalance();
		holder1.withdraw(100);
		holder1.showBalance();
		holder1.charge(50, "table");
		holder1.showBalance();

	}

}

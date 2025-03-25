package Developer;

public class BankAccount {
	public static int numAccount;
	private String ownerName;
	private double balance;
	String accountNumber;
	
	public BankAccount(String ownerName, String accountNumber, double balance){
		this.ownerName = ownerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		numAccount++;
	}
	
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("Deposit: $" + amount);
	}
	
	protected void withdraw(double amount) {
		if(balance>amount) {
			balance-=amount;
			System.out.println("Withdraw: $" + amount);
		}
		else System.out.println("Not enough balance!");
	}
	
	public void setWithdraw(double amount) {
		withdraw(amount);
	}
	
	void printInfo() {
		System.out.println(ownerName + " has $" + balance);
	}
	
	public double getBalance() {
		return balance;
	}
}

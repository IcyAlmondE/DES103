package Developer;

public class BankAccount1_Testing {
	public static void main(String[] args) {

		BankAccount account1 = new BankAccount("Paris Hilton", "127-983-3847", 1000000.00);

		//System.out.println("The balance of account1 is $" + account1.balance);

		// deposit $300 for account1
		account1.deposit(300);
		// print out the The balance of account1
		System.out.println("The balance of account1 is $" + account1.getBalance());
	}
}